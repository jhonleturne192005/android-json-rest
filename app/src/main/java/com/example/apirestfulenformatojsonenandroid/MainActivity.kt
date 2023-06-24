package com.example.apirestfulenformatojsonenandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apirestfulenformatojsonenandroid.ConeccionAPI.coneccion
import com.example.apirestfulenformatojsonenandroid.adapterRV.usersAdapter
import com.example.apirestfulenformatojsonenandroid.dataResponse.responseDataUsers
import com.example.apirestfulenformatojsonenandroid.dataResponse.responseUsers
import com.example.apirestfulenformatojsonenandroid.databinding.ActivityMainBinding
import com.example.apirestfulenformatojsonenandroid.encodeAnddecodeObject.decodeAndDecode
import com.example.apirestfulenformatojsonenandroid.interfacesAPI.ApiService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.NotSerializableException
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.io.Serializable


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var Users: responseUsers
    private lateinit var usersADAPTER:usersAdapter

    companion object{
        const val keyBundleUsers="objUsers"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)
        loadDataUsers()
    }


    private fun initRVAdapter():Unit{
        usersADAPTER= usersAdapter(Users.usersList,{x->changedView(x)})
        binding.rvItems.layoutManager=LinearLayoutManager(this)
        binding.rvItems.adapter=usersADAPTER
    }


    private fun loadDataUsers():Unit{
        CoroutineScope(Dispatchers.IO).launch {
            val responseUsersRetrofit= coneccion().retrofitObj.create(ApiService::class.java).getUsers()
            if (responseUsersRetrofit.isSuccessful){
                Users=responseUsersRetrofit.body()!!
                runOnUiThread{
                    initRVAdapter()
                    Log.i("respuestaUsers",Users.toString())
                }
            }
        }
    }


    private fun changedView(responseDataUsers: responseDataUsers):Unit
    {
        try {
            val intent = Intent(this, resultsActivity::class.java)
            var bundle = Bundle()
            bundle.putByteArray(keyBundleUsers, decodeAndDecode().ObjectToByteArray(responseDataUsers))
            intent.putExtras(bundle)
            startActivity(intent)
        }catch (e:Exception){
            Log.i("errorIntent",e.message.toString())
        }
    }


}