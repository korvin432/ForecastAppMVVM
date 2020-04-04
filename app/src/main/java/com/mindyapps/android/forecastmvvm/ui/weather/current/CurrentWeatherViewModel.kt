package com.mindyapps.android.forecastmvvm.ui.weather.current

import androidx.lifecycle.ViewModel
import com.mindyapps.android.forecastmvvm.data.repository.ForecastRepository
import com.mindyapps.android.forecastmvvm.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository
) : ViewModel() {
    val weather by lazyDeferred{
        forecastRepository.getCurrentWeather()
    }
}
























