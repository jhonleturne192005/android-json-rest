package com.example.apirestfulenformatojsonenandroid.adapterRV

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.apirestfulenformatojsonenandroid.dataResponse.responseDataUsers
import com.example.apirestfulenformatojsonenandroid.databinding.UsuarioLyBinding

class usersViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding=UsuarioLyBinding.bind(view)


    fun bind(respons: responseDataUsers?,itemSelected:(responseDataUsers)->Unit):Unit{
        binding.datNombre.text=respons?.firstName+" "+respons?.lastName
        binding.datCorreo.text=respons?.email
        binding.datEdad.text=respons?.age.toString()
        binding.datFecha.text=respons?.birthDate
        binding.datUsuario.text=respons?.username

        binding.root.setOnClickListener{
            if (respons != null)
                itemSelected(respons)
        }

    }


}