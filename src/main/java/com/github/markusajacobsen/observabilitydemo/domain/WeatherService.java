package com.github.markusajacobsen.observabilitydemo.domain;

import com.github.markusajacobsen.observabilitydemo.data.LocationEntity;
import com.github.markusajacobsen.observabilitydemo.data.LocationRepository;
import org.springframework.stereotype.Component;

@Component
public class WeatherService {

    private final IWeatherConnector weatherConnector;
    private final LocationRepository locationRepository;

    public WeatherService(IWeatherConnector weatherConnector, LocationRepository locationRepository) {
        this.weatherConnector = weatherConnector;
        this.locationRepository = locationRepository;
    }

    public CurrentWeatherDto getCurrentWeather(String city) {
        CurrentWeatherDto current = weatherConnector.getCurrentWeather(city);

        if (!locationRepository.existsByName(city)) {
            locationRepository.save(new LocationEntity(current.city(), current.region(), current.country()));
        }

        return current;
    }
}
