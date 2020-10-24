package com.tenera.weatherapp.controller;

import com.tenera.weatherapp.dto.Weather;
import com.tenera.weatherapp.dto.WeatherHistory;
import com.tenera.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/current")
    public Weather queryCurrentWeather(@RequestParam(value = "location") String location) {
        // pass the city name to weather API, return either normal response or 404
        return new Weather();
    }

    @GetMapping("/history")
    public WeatherHistory queryHistory(@RequestParam(value = "location") String location) {

        // call weather service
        return weatherService.queryHistory(location);
    }
}