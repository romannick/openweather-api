package nikolay.romanov.openweatherApi.services.impl;

import nikolay.romanov.openweatherApi.models.CurrentAirPollutionModel;
import nikolay.romanov.openweatherApi.services.AirPollutionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

import static java.util.Map.entry;

@Service
public class AirPollutionServiceImpl extends BaseService implements AirPollutionService {
    private final Logger logger = LoggerFactory.getLogger(AirPollutionServiceImpl.class);

    @Override
    public CurrentAirPollutionModel getCurrentAirPollution(String lat, String lon) {
        logger.debug("getCurrentAirPollution: lat=" + lat + ", lon=" + lon);

        Map<String, String> queryParams = Map.ofEntries(
                entry("lat", lat),
                entry("lon", lon)
        );
        Object currentAirPollution = this.executeRequest("/air_pollution", queryParams, CurrentAirPollutionModel.class);

        return (CurrentAirPollutionModel) currentAirPollution;
    }
}
