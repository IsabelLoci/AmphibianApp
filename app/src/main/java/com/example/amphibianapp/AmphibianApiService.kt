package com.example.amphibianapp.network

import com.example.amphibianapp.Amphibian
import retrofit2.http.GET

interface AmphibianApiService {
    @GET("amphibians")
    suspend fun getAmphibians(): List<Amphibian>
}
