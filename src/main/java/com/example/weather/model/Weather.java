package com.example.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Weather implements Serializable {
    @JsonProperty("temp")
    private int temp;
    @JsonProperty("wind_speed")
    private double wind_speed;
    @JsonProperty("wind_degrees")
    private double wind_degrees;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("sunset")
    private int sunset;
    @JsonProperty("min_temp")
    private int min_temp;
    @JsonProperty("cloud_pct")
    private int cloud_pct;
    @JsonProperty("feels_like")
    private int feels_like;
    @JsonProperty("sunrise")
    private int sunrise;
    @JsonProperty("max_temp")
    private int max_temp;
}
