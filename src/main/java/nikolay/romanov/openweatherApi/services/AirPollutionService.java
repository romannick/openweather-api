package nikolay.romanov.openweatherApi.services;

import nikolay.romanov.openweatherApi.models.CurrentAirPollutionModel;
import org.springframework.stereotype.Service;

@Service
public interface AirPollutionService {
    CurrentAirPollutionModel getCurrentAirPollution(String lat, String lon);
}
