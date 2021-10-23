package nikolay.romanov.openweatherApi.models;

import nikolay.romanov.openweatherApi.models.shared.*;

import java.util.List;

public class CurrentWeatherModel {
    private final Coordinates coord;
    private final List<Weather> weather;
    private final String base;
    private final Main main;
    private final int visibility;
    private final Wind wind;
    private final Clouds clouds;
    private final long dt;
    private final Sys sys;
    private final int timezone;
    private final int id;
    private final String name;
    private final int cod;

    public CurrentWeatherModel(Coordinates coord,
                               List<Weather> weather,
                               String base,
                               Main main,
                               int visibility,
                               Wind wind,
                               Clouds clouds,
                               long dt,
                               Sys sys,
                               int timezone,
                               int id,
                               String name,
                               int cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public Coordinates getCoord() {
        return coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public Main getMain() {
        return main;
    }

    public int getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public long getDt() {
        return dt;
    }

    public Sys getSys() {
        return sys;
    }

    public int getTimezone() {
        return timezone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCod() {
        return cod;
    }

    private static class Sys {
        private final int type;
        private final int id;
        private final String country;
        private final long sunrise;
        private final long sunset;

        public Sys(int type, int id, String country, long sunrise, long sunset) {
            this.type = type;
            this.id = id;
            this.country = country;
            this.sunrise = sunrise;
            this.sunset = sunset;
        }

        public int getType() {
            return type;
        }

        public int getId() {
            return id;
        }

        public String getCountry() {
            return country;
        }

        public long getSunrise() {
            return sunrise;
        }

        public long getSunset() {
            return sunset;
        }
    }
}
