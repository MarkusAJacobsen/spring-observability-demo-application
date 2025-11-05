package com.github.markusajacobsen.observabilitydemo.domain;

import org.springframework.stereotype.Component;

@Component
public class WeatherService {
    
    private final IWeatherConnector weatherConnector;
    
    public WeatherService(IWeatherConnector weatherConnector) {
        this.weatherConnector = weatherConnector;
    }
    
    public CurrentWeatherDto getCurrentWeather(String city) {
        return weatherConnector.getCurrentWeather(city);
    }
}
