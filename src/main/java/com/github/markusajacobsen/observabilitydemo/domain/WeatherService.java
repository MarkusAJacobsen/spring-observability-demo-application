package com.github.markusajacobsen.observabilitydemo.domain;

import org.springframework.stereotype.Component;

@Component
public class WeatherService {
    public CurrentWeatherDto getCurrentWeather(String city) {
        return new CurrentWeatherDto(
            city,
            "Sunny with a chance of meatballs"
        );
    }
}
