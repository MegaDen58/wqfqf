package com.example.weather.jms;

import com.example.weather.model.Weather;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class WeatherListener {


    @JmsListener(destination = "weatherQueue")
    public void readWeather(Weather weather){
        System.out.println("Данные сохранены в БД");
    }
}
