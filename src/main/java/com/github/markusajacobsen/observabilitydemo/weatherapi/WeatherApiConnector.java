package com.github.markusajacobsen.observabilitydemo.weatherapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.github.markusajacobsen.observabilitydemo.domain.CurrentWeatherDto;
import com.github.markusajacobsen.observabilitydemo.domain.IWeatherConnector;

import reactor.core.publisher.Mono;

@Component
public class WeatherApiConnector implements IWeatherConnector {
    private static final Logger LOGGER = LoggerFactory.getLogger(WeatherApiConnector.class);

    private final WebClient webClient;
    
    @Value("${weatherapi.apikey}")
    private String apiKey;
    
    public WeatherApiConnector(WebClient weatherApiWebClient) {
        this.webClient = weatherApiWebClient;
    }
    
    public CurrentWeatherDto getCurrentWeather(String city) {
        try {
            WeatherResponseDTO result = webClient.get()
                    .uri("/current.json?key={apiKey}&q={city}&aqi=no", apiKey, city)
                    .accept(MediaType.APPLICATION_JSON)
                    .retrieve()
                    .onStatus(
                            status -> status.is4xxClientError() || status.is5xxServerError(),
                            clientResponse -> clientResponse.createException().flatMap(Mono::error)
                    )
                    .bodyToMono(WeatherResponseDTO.class)
                    .block();
            LOGGER.info("Got weather data: {}", result.toString());
            return new CurrentWeatherDto(city, String.valueOf(result.getCurrent().getTempC()));
        } catch (Exception e) {
            if (e instanceof WebClientResponseException) {
                WebClientResponseException webClientResponseException = (WebClientResponseException) e;
                LOGGER.warn("Error getting weather: " + webClientResponseException.getStatusCode() + " " + webClientResponseException.getResponseBodyAsString());
            }
            
            LOGGER.error("", e);
        }
        
		return null;
    }
}