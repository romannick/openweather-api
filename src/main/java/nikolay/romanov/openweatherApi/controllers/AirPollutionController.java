package nikolay.romanov.openweatherApi.controllers;

import nikolay.romanov.openweatherApi.models.CurrentAirPollutionModel;
import nikolay.romanov.openweatherApi.services.AirPollutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/airPollution")
public class AirPollutionController {
    private final AirPollutionService airPollutionService;

    @Autowired
    public AirPollutionController(AirPollutionService airPollutionService) {
        this.airPollutionService = airPollutionService;
    }

    @GetMapping("/current")
    public @ResponseBody
    CurrentAirPollutionModel getCurrentAirPollution(@RequestParam String lat, @RequestParam String lon) {
        return this.airPollutionService.getCurrentAirPollution(lat, lon);
    }
}
