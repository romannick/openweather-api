package nikolay.romanov.openweatherApi.services.impl;

import nikolay.romanov.openweatherApi.models.CurrentWeatherModel;
import nikolay.romanov.openweatherApi.services.CurrentWeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CurrentWeatherServiceImpl extends BaseService implements CurrentWeatherService {
    private final Logger logger = LoggerFactory.getLogger(AirPollutionServiceImpl.class);

    @Override
    public CurrentWeatherModel getCurrentWeather(String city) {
        logger.debug("getCurrentWeather: city=" + city);

        Object currentWeather = this.executeRequest("/weather", this.getCityParam(city), CurrentWeatherModel.class);

        return (CurrentWeatherModel) currentWeather;
    }
}
