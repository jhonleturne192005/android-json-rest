package com.example.apirestfulenformatojsonenandroid.interfacesAPI

import com.example.apirestfulenformatojsonenandroid.dataResponse.responseUsers
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/users")
    suspend fun getUsers():Response<responseUsers>


}