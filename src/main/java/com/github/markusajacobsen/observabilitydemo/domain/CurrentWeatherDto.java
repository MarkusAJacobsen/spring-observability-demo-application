package com.github.markusajacobsen.observabilitydemo.domain;

import java.math.BigDecimal;

public record CurrentWeatherDto(
     String city,
     String region,
     String country,
     BigDecimal temperatureCelsius,
     BigDecimal feelsLikeCelsius,
     BigDecimal windKph
) {}