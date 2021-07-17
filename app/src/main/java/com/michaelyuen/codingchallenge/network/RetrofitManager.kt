package com.michaelyuen.codingchallenge.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitManager private constructor() {
    private val myAPIService: ApiService

    companion object {
        // 以Singleton模式建立
        val instance = RetrofitManager()
    }

    init {
        // 設置baseUrl即要連的網站，addConverterFactory用Gson作為資料處理Converter
        val retrofit = Retrofit.Builder()
                .baseUrl("http://api.currencylayer.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        myAPIService = retrofit.create(ApiService::class.java)
    }

    fun getAPI(): ApiService? {
        return myAPIService
    }
}
