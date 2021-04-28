package com.example.weatherapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.example.weatherapp.constans.Constants.Companion.BASE_URL

object NetworkClient {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api: OpenWeatherAPI by lazy {
        retrofit.create(OpenWeatherAPI::class.java)
    }
}