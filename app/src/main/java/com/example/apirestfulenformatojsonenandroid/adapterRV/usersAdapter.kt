package com.example.apirestfulenformatojsonenandroid.adapterRV

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apirestfulenformatojsonenandroid.R
import com.example.apirestfulenformatojsonenandroid.dataResponse.responseDataUsers

class usersAdapter(var lstUsers:List<responseDataUsers>?,var itemSelected:(responseDataUsers)->Unit)
                                                            :RecyclerView.Adapter<usersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): usersViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return usersViewHolder(layoutInflater.inflate(R.layout.usuario_ly,parent,false))
    }

    override fun getItemCount(): Int {
        var t:Int=lstUsers?.size!!
        return t
    }

    override fun onBindViewHolder(holder: usersViewHolder, position: Int) {
        holder.bind(lstUsers?.get(position),itemSelected)
    }

}