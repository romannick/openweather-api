package nikolay.romanov.openweatherApi.services.impl;

import nikolay.romanov.openweatherApi.models.FiveDayThreeHourForecastModel;
import nikolay.romanov.openweatherApi.services.ForecastWeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ForecastWeatherServiceImpl extends BaseService implements ForecastWeatherService {
    private final Logger logger = LoggerFactory.getLogger(AirPollutionServiceImpl.class);

    @Override
    public FiveDayThreeHourForecastModel getFiveDayThreeHourForecast(String city) {
        logger.debug("getFiveDayThreeHourForecast: city=" + city);

        Object fiveDayThreeHourForecast = this.executeRequest("/forecast", this.getCityParam(city), FiveDayThreeHourForecastModel.class);

        return (FiveDayThreeHourForecastModel) fiveDayThreeHourForecast;
    }
}
