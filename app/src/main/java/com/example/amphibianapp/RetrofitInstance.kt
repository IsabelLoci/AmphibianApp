package com.example.amphibianapp

import com.example.amphibianapp.network.AmphibianApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

val amphibianApiService = retrofit.create(AmphibianApiService::class.java)
