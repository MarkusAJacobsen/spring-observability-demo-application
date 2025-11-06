package com.github.markusajacobsen.observabilitydemo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.markusajacobsen.observabilitydemo.domain.CurrentWeatherDto;
import com.github.markusajacobsen.observabilitydemo.domain.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private static final Logger LOGGER = LoggerFactory.getLogger(WeatherController.class);
    
    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/current/city/{city}",
            produces = {"application/json"}
    )
    public ResponseEntity<CurrentWeatherDto> getCurrentWeather(
            @PathVariable String city
    ) {

        LOGGER.info("Getting current weather in city {}", city);

        return new ResponseEntity<>(weatherService.getCurrentWeather(city), HttpStatus.OK);
    }
}