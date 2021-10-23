package nikolay.romanov.openweatherApi.controllers;

import nikolay.romanov.openweatherApi.models.FiveDayThreeHourForecastModel;
import nikolay.romanov.openweatherApi.services.ForecastWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/forecast")
public class ForecastWeaatherController {
    private final ForecastWeatherService forecastWeatherService;

    @Autowired
    public ForecastWeaatherController(ForecastWeatherService forecastWeatherService) {
        this.forecastWeatherService = forecastWeatherService;
    }

    @GetMapping("/5day3hour")
    public @ResponseBody
    FiveDayThreeHourForecastModel getFiveDayThreeHourForecast(@RequestParam String city) {
        return this.forecastWeatherService.getFiveDayThreeHourForecast(city);
    }
}
