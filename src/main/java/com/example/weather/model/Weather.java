package com.example.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "weather")
public class Weather implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "city")
    private String city;
    @Column(name = "temp")
    @JsonProperty("temp")
    private int temp;
    @Column(name = "wind_speed")
    @JsonProperty("wind_speed")
    private double wind_speed;
    @Column(name = "wind_degrees")
    @JsonProperty("wind_degrees")
    private double wind_degrees;
    @Column(name = "humidity")
    @JsonProperty("humidity")
    private int humidity;
    @Column(name = "sunset")
    @JsonProperty("sunset")
    private int sunset;
    @Column(name = "min_temp")
    @JsonProperty("min_temp")
    private int min_temp;
    @Column(name = "cloud_pct")
    @JsonProperty("cloud_pct")
    private int cloud_pct;
    @Column(name = "feels_like")
    @JsonProperty("feels_like")
    private int feels_like;
    @Column(name = "sunrise")
    @JsonProperty("sunrise")
    private int sunrise;
    @Column(name = "max_temp")
    @JsonProperty("max_temp")
    private int max_temp;

    public void Print(){
        System.out.println(String.format("id = %s\ncity = %s\ntemp = %s\nwind_speed = %s\nwind_degrees = %s\n" +
                "humidity = %s\nsunset = %s\nmin_temp = %s\ncloud_pct = %s\nfeels_like = %s\nsunrise = %s\nmax_temp = %s",
                id, city, temp, wind_speed, wind_degrees, humidity, sunset, min_temp, cloud_pct, feels_like, sunrise, max_temp));
    }
}
