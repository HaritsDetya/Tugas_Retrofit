package com.example.tugas_retrofit.network

import com.example.tugas_retrofit.model.Users
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("data.php")
    fun getAllUsers(): Call<Users>
}