package com.example.apirestfulenformatojsonenandroid

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import com.example.apirestfulenformatojsonenandroid.MainActivity.Companion.keyBundleUsers
import com.example.apirestfulenformatojsonenandroid.dataResponse.responseDataUsers
import com.example.apirestfulenformatojsonenandroid.dataResponse.responseUsers
import com.example.apirestfulenformatojsonenandroid.databinding.ActivityResultsBinding
import com.example.apirestfulenformatojsonenandroid.encodeAnddecodeObject.decodeAndDecode
import com.example.apirestfulenformatojsonenandroid.setInfoResult.setInfoResult
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.io.ByteArrayInputStream
import java.io.ObjectInputStream


class resultsActivity : AppCompatActivity() {

    private lateinit var binding:ActivityResultsBinding
    private lateinit var User:responseDataUsers

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getDataIntent();
        setInfoResult(User,binding)
    }


    private fun getDataIntent():Unit{

        try {
            var bundle: Bundle? = intent.extras
            User=decodeAndDecode().decodeToObject(bundle?.getByteArray(keyBundleUsers)!!)
            Log.i("CorreoPrueba", User.email.toString())
        }catch (ex:Exception){
            Log.i("ErrorObtenerInfo", ex.message.toString())
        }
    }


}