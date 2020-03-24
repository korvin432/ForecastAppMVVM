package com.mindyapps.android.forecastmvvm.data.network.response


import com.google.gson.annotations.SerializedName
import com.mindyapps.android.forecastmvvm.data.db.entity.CurrentWeatherEntry
import com.mindyapps.android.forecastmvvm.data.db.entity.Location

data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val location: Location,
    val request: Request
)