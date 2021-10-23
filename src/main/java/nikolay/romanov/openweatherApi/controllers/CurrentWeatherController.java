package nikolay.romanov.openweatherApi.controllers;

import nikolay.romanov.openweatherApi.models.CurrentWeatherModel;
import nikolay.romanov.openweatherApi.services.CurrentWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/current")
public class CurrentWeatherController {
    private final CurrentWeatherService currentWeatherService;

    @Autowired
    public CurrentWeatherController(CurrentWeatherService currentWeatherService) {
        this.currentWeatherService = currentWeatherService;
    }

    @GetMapping()
    public @ResponseBody CurrentWeatherModel getCurrentWeather(@RequestParam String city) {
        return this.currentWeatherService.getCurrentWeather(city);
    }
}
