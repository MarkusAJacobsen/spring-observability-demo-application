package com.github.markusajacobsen.observabilitydemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ConnectorConfig {
    
    @Bean
    public WebClient weatherApiWebClient(WebClient.Builder webClientBuilder) {
        return webClientBuilder.baseUrl("https://api.weatherapi.com/v1").build();
    }
}