package com.github.markusajacobsen.observabilitydemo.weatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentDTO {
    @JsonProperty("last_updated_epoch")
    private Long lastUpdatedEpoch;

    @JsonProperty("last_updated")
    private String lastUpdated;

    @JsonProperty("temp_c")
    private BigDecimal tempC;

    @JsonProperty("temp_f")
    private BigDecimal tempF;

    @JsonProperty("is_day")
    private Integer isDay;

    @JsonProperty("condition")
    private ConditionDTO condition;

    @JsonProperty("wind_mph")
    private BigDecimal windMph;

    @JsonProperty("wind_kph")
    private BigDecimal windKph;

    @JsonProperty("wind_degree")
    private Integer windDegree;

    @JsonProperty("wind_dir")
    private String windDir;

    @JsonProperty("pressure_mb")
    private BigDecimal pressureMb;

    @JsonProperty("pressure_in")
    private BigDecimal pressureIn;

    @JsonProperty("precip_mm")
    private BigDecimal precipMm;

    @JsonProperty("precip_in")
    private BigDecimal precipIn;

    @JsonProperty("humidity")
    private Integer humidity;

    @JsonProperty("cloud")
    private Integer cloud;

    @JsonProperty("feelslike_c")
    private BigDecimal feelslikeC;

    @JsonProperty("feelslike_f")
    private BigDecimal feelslikeF;

    @JsonProperty("windchill_c")
    private BigDecimal windchillC;

    @JsonProperty("windchill_f")
    private BigDecimal windchillF;

    @JsonProperty("heatindex_c")
    private BigDecimal heatindexC;

    @JsonProperty("heatindex_f")
    private BigDecimal heatindexF;

    @JsonProperty("dewpoint_c")
    private BigDecimal dewpointC;

    @JsonProperty("dewpoint_f")
    private BigDecimal dewpointF;

    @JsonProperty("vis_km")
    private BigDecimal visKm;

    @JsonProperty("vis_miles")
    private BigDecimal visMiles;

    @JsonProperty("uv")
    private BigDecimal uv;

    @JsonProperty("gust_mph")
    private BigDecimal gustMph;

    @JsonProperty("gust_kph")
    private BigDecimal gustKph;

    @JsonProperty("short_rad")
    private BigDecimal shortRad;

    @JsonProperty("diff_rad")
    private BigDecimal diffRad;

    @JsonProperty("dni")
    private BigDecimal dni;

    @JsonProperty("gti")
    private BigDecimal gti;

    public CurrentDTO() {
       
    }

    public Long getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public BigDecimal getTempC() {
        return tempC;
    }

    public BigDecimal getTempF() {
        return tempF;
    }

    public Integer getIsDay() {
        return isDay;
    }

    public ConditionDTO getCondition() {
        return condition;
    }

    public BigDecimal getWindMph() {
        return windMph;
    }

    public BigDecimal getWindKph() {
        return windKph;
    }

    public Integer getWindDegree() {
        return windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public BigDecimal getPressureMb() {
        return pressureMb;
    }

    public BigDecimal getPressureIn() {
        return pressureIn;
    }

    public BigDecimal getPrecipMm() {
        return precipMm;
    }

    public BigDecimal getPrecipIn() {
        return precipIn;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public Integer getCloud() {
        return cloud;
    }

    public BigDecimal getFeelslikeC() {
        return feelslikeC;
    }

    public BigDecimal getFeelslikeF() {
        return feelslikeF;
    }

    public BigDecimal getWindchillC() {
        return windchillC;
    }

    public BigDecimal getWindchillF() {
        return windchillF;
    }

    public BigDecimal getHeatindexC() {
        return heatindexC;
    }

    public BigDecimal getHeatindexF() {
        return heatindexF;
    }

    public BigDecimal getDewpointC() {
        return dewpointC;
    }

    public BigDecimal getDewpointF() {
        return dewpointF;
    }

    public BigDecimal getVisKm() {
        return visKm;
    }

    public BigDecimal getVisMiles() {
        return visMiles;
    }

    public BigDecimal getUv() {
        return uv;
    }

    public BigDecimal getGustMph() {
        return gustMph;
    }

    public BigDecimal getGustKph() {
        return gustKph;
    }

    public BigDecimal getShortRad() {
        return shortRad;
    }

    public BigDecimal getDiffRad() {
        return diffRad;
    }

    public BigDecimal getDni() {
        return dni;
    }

    public BigDecimal getGti() {
        return gti;
    }

    @Override
    public String toString() {
        return "CurrentDTO{" +
               "lastUpdatedEpoch=" + lastUpdatedEpoch +
               ", lastUpdated='" + lastUpdated + '\'' +
               ", tempC=" + tempC +
               ", tempF=" + tempF +
               ", isDay=" + isDay +
               ", condition=" + condition +
               ", windMph=" + windMph +
               ", windKph=" + windKph +
               ", windDegree=" + windDegree +
               ", windDir='" + windDir + '\'' +
               ", pressureMb=" + pressureMb +
               ", pressureIn=" + pressureIn +
               ", precipMm=" + precipMm +
               ", precipIn=" + precipIn +
               ", humidity=" + humidity +
               ", cloud=" + cloud +
               ", feelslikeC=" + feelslikeC +
               ", feelslikeF=" + feelslikeF +
               ", windchillC=" + windchillC +
               ", windchillF=" + windchillF +
               ", heatindexC=" + heatindexC +
               ", heatindexF=" + heatindexF +
               ", dewpointC=" + dewpointC +
               ", dewpointF=" + dewpointF +
               ", visKm=" + visKm +
               ", visMiles=" + visMiles +
               ", uv=" + uv +
               ", gustMph=" + gustMph +
               ", gustKph=" + gustKph +
               ", shortRad=" + shortRad +
               ", diffRad=" + diffRad +
               ", dni=" + dni +
               ", gti=" + gti +
               '}';
    }
}