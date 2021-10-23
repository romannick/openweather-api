package nikolay.romanov.openweatherApi.services;

import nikolay.romanov.openweatherApi.models.CurrentWeatherModel;
import org.springframework.stereotype.Service;

@Service
public interface CurrentWeatherService {
    CurrentWeatherModel getCurrentWeather(String city);
}
