package com.github.markusajacobsen.observabilitydemo.domain;

public record CurrentWeatherDto(
     String city,
     String weatherDescription
) {}