package com.github.markusajacobsen.observabilitydemo.config;

import com.github.markusajacobsen.observabilitydemo.domain.IWeatherConnector;
import com.github.markusajacobsen.observabilitydemo.weatherapi.WeatherApiConnector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ServiceConfig {

    @Bean
    public IWeatherConnector weatherConnector(WebClient weatherApiWebClient) {
        return new WeatherApiConnector(weatherApiWebClient);
    }
}
