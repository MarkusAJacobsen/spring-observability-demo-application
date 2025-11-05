package com.github.markusajacobsen.observabilitydemo.weatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationDTO {

    @JsonProperty("name")
    private String name;

    @JsonProperty("region")
    private String region;

    @JsonProperty("country")
    private String country;

    @JsonProperty("lat")
    private BigDecimal lat;

    @JsonProperty("lon")
    private BigDecimal lon;

    @JsonProperty("tz_id")
    private String timeZoneId;

    @JsonProperty("localtime_epoch")
    private Long localtimeEpoch;

    @JsonProperty("localtime")
    private String localtime;
    
    public LocationDTO() {   }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public BigDecimal getLon() {
        return lon;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public Long getLocaltimeEpoch() {
        return localtimeEpoch;
    }

    public String getLocaltime() {
        return localtime;
    }

    @Override
    public String toString() {
        return "LocationDTO{" +
               "name='" + name + '\'' +
               ", region='" + region + '\'' +
               ", country='" + country + '\'' +
               ", lat=" + lat +
               ", lon=" + lon +
               ", timeZoneId='" + timeZoneId + '\'' +
               ", localtimeEpoch=" + localtimeEpoch +
               ", localtime='" + localtime + '\'' +
               '}';
    }
}