package com.mindyapps.android.forecastmvvm.data.network

import androidx.lifecycle.LiveData
import com.mindyapps.android.forecastmvvm.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(location: String)
}