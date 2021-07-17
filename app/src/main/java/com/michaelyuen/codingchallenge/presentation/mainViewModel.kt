package com.michaelyuen.codingchallenge.presentation

import androidx.lifecycle.ViewModel
import com.google.gson.JsonObject
import com.michaelyuen.codingchallenge.network.ApiService
import retrofit2.Response
import rx.Single

class mainViewModel(private val apiService: ApiService): ViewModel() {
    fun getCurrencyData(accessKey: String): Response<JsonObject?>? {
        return apiService.getCurrencyData(accessKey)
    }
}