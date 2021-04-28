package com.example.weatherapp.data

import com.google.gson.annotations.SerializedName

data class Temperature (@SerializedName("day") var dayTemperature: Double,
                        @SerializedName("night") var nightTemperature: Double)