package com.mindyapps.android.forecastmvvm.data.repository

import androidx.lifecycle.LiveData
import com.mindyapps.android.forecastmvvm.data.db.entity.CurrentWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather(): LiveData<CurrentWeatherEntry>
}