package com.michaelyuen.codingchallenge.network

import com.google.gson.JsonObject
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET(".")
    fun getCurrencyData(@Query("access_key") accessKey: String): Response<JsonObject?>?
}