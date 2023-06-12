package com.example.weather.jms;

import com.example.weather.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;


@Component
public class WeatherProducer {
    private JmsTemplate jmsTemplate;

    @Autowired
    public void setJmsTemplate(JmsTemplate jmsTemplate){
        this.jmsTemplate = jmsTemplate;
    }

    public void sendWeather(Weather weather){
        jmsTemplate.convertAndSend("weatherQueue", weather);
        System.out.println("Сообщение отправлено.");

    }
}
