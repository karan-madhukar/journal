package com.karan.journal.service;

import com.karan.journal.api.reponse.WeatherResponse;
import com.karan.journal.cache.AppCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {

    @Autowired
    private AppCache appCache;

    @Value("${wheatherApiKey}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RedisService redisService;

    public WeatherResponse getWeather(String city) {
        WeatherResponse weatherResponse =  redisService.get("weather_of_" + city, WeatherResponse.class);
        if (weatherResponse == null) {
        String finalApi = appCache.appCache.get("weather_api").replace("<apiKey>", apiKey).replace("<city>", city);
        WeatherResponse body = restTemplate.getForObject(finalApi, WeatherResponse.class);
            if (body != null) {
                redisService.set("weather_of_" + city, body,  300);
            }
                return body;
            } else {
                return weatherResponse;
            }
    }
}
