package com.example.weatherapp.api

import com.example.weatherapp.data.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherAPI {
    @GET("forecast/daily")
    fun dailyForecast(@Query("q") cityName: String, @Query("cnt") dayCount: Int ): Call<WeatherResponse>


}