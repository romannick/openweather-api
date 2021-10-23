package nikolay.romanov.openweatherApi.services;

import nikolay.romanov.openweatherApi.models.FiveDayThreeHourForecastModel;
import org.springframework.stereotype.Service;

@Service
public interface ForecastWeatherService {
    FiveDayThreeHourForecastModel getFiveDayThreeHourForecast(String city);
}
