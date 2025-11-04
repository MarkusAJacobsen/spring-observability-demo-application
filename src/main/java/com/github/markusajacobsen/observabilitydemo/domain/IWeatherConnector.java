package com.github.markusajacobsen.observabilitydemo.domain;

public interface IWeatherConnector {
    CurrentWeatherDto getCurrentWeather(String city);
}