package com.example.weather.controller;

import com.example.weather.model.Weather;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @GetMapping("{city}")
    public int getWeather(@PathVariable String city) throws Exception{
        URL url = new URL("https://api.api-ninjas.com/v1/weather?city=" + city);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.addRequestProperty("X-Api-Key", "aCQf5mYIfKNIhy2etdORbQ==4lC2SUpMjyg9CTpq");
        InputStream responseStream = connection.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(responseStream);
        Weather weather = mapper.readValue(root.toString(), Weather.class);

        int currentTemperature = weather.getTemp();

        return currentTemperature;
    }
}
