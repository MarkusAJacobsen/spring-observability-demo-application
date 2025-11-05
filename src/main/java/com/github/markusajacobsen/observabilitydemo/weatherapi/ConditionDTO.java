package com.github.markusajacobsen.observabilitydemo.weatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConditionDTO {

    @JsonProperty("text")
    private String text;

    @JsonProperty("icon")
    private String icon;

    @JsonProperty("code")
    private Integer code;

    public ConditionDTO() {}

    public String getText() {
        return text;
    }

    public String getIcon() {
        return icon;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "ConditionDTO{" +
               "text='" + text + '\'' +
               ", icon='" + icon + '\'' +
               ", code=" + code +
               '}';
    }
}