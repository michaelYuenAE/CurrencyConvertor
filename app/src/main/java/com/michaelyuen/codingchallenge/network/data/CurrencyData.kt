package com.michaelyuen.codingchallenge.network.data

data class CurrencyData(
    val privacy: String,
    val quotes: Quotes,
    val source: String,
    val success: Boolean,
    val terms: String,
    val timestamp: Int
)