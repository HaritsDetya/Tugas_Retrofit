package com.example.tugas_retrofit.model

import com.google.gson.annotations.SerializedName

data class Users(
    @SerializedName("result")
    val data: List<Data>
)
