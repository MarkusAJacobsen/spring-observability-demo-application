package com.github.markusajacobsen.observabilitydemo.weatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponseDTO {

    @JsonProperty("location")
    private LocationDTO location;

    @JsonProperty("current")
    private CurrentDTO current;

    public WeatherResponseDTO() {
    }

    public LocationDTO getLocation() {
        return location;
    }

    public CurrentDTO getCurrent() {
        return current;
    }

    /**
     * Convenience delegate getters (optional). These can be removed if you prefer strict nesting.
     */
    public String getLocationName() {
        return location != null ? location.getName() : null;
    }

    public String getLocationCountry() {
        return location != null ? location.getCountry() : null;
    }

    public String getConditionText() {
        return current != null && current.getCondition() != null
            ? current.getCondition().getText()
            : null;
    }

    @Override
    public String toString() {
        return "WeatherResponseDTO{" +
               "location=" + location +
               ", current=" + current +
               '}';
    }
}