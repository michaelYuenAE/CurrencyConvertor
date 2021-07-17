package com.michaelyuen.codingchallenge.network

import com.google.gson.JsonObject
import retrofit2.Response
import rx.Single

class CurrencyRepository constructor(private val apiService: ApiService) {
    fun getCurrencyData(accessKey: String): Response<JsonObject?>? {
        return apiService.getCurrencyData(accessKey)
    }
}