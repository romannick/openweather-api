package nikolay.romanov.openweatherApi.models;

import nikolay.romanov.openweatherApi.models.shared.*;

import java.util.List;

public class FiveDayThreeHourForecastModel {
    private final String cod;
    private final int message;
    private final int cnt;
    private final List<ListData> list;
    private final City city;

    public FiveDayThreeHourForecastModel(String cod, int message, int cnt, List<ListData> list, City city) {
        this.cod = cod;
        this.message = message;
        this.cnt = cnt;
        this.list = list;
        this.city = city;
    }

    public String getCod() {
        return cod;
    }

    public int getMessage() {
        return message;
    }

    public int getCnt() {
        return cnt;
    }

    public List<ListData> getList() {
        return list;
    }

    public City getCity() {
        return city;
    }

    private static class ListData {
        private final long dt;
        private final Main main;
        private final List<Weather> weather;
        private final Clouds clouds;
        private final Wind wind;
        private final int visibility;
        private final double pop;
        private final Sys sys;
        private final String dt_txt;

        public ListData(long dt,
                        Main main,
                        List<Weather> weather,
                        Clouds clouds,
                        Wind wind,
                        int visibility,
                        double pop,
                        Sys sys,
                        String dt_txt) {
            this.dt = dt;
            this.main = main;
            this.weather = weather;
            this.clouds = clouds;
            this.wind = wind;
            this.visibility = visibility;
            this.pop = pop;
            this.sys = sys;
            this.dt_txt = dt_txt;
        }

        public long getDt() {
            return dt;
        }

        public Main getMain() {
            return main;
        }

        public List<Weather> getWeather() {
            return weather;
        }

        public Clouds getClouds() {
            return clouds;
        }

        public Wind getWind() {
            return wind;
        }

        public int getVisibility() {
            return visibility;
        }

        public double getPop() {
            return pop;
        }

        public Sys getSys() {
            return sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        private static class Sys {
            private final String pod;

            public Sys(String pod) {
                this.pod = pod;
            }

            public String getPod() {
                return pod;
            }
        }
    }

    private static class City {
        private final int id;
        private final String name;
        private final Coordinates coord;
        private final String country;
        private final int population;
        private final int timezone;
        private final long sunrise;
        private final long sunset;

        public City(int id, String name, Coordinates coord, String country, int population, int timezone, long sunrise, long sunset) {
            this.id = id;
            this.name = name;
            this.coord = coord;
            this.country = country;
            this.population = population;
            this.timezone = timezone;
            this.sunrise = sunrise;
            this.sunset = sunset;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Coordinates getCoord() {
            return coord;
        }

        public String getCountry() {
            return country;
        }

        public int getPopulation() {
            return population;
        }

        public int getTimezone() {
            return timezone;
        }

        public long getSunrise() {
            return sunrise;
        }

        public long getSunset() {
            return sunset;
        }
    }
}
