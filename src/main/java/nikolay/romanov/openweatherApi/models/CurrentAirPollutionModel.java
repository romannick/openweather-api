package nikolay.romanov.openweatherApi.models;

import nikolay.romanov.openweatherApi.models.shared.Coordinates;

import java.util.List;

public class CurrentAirPollutionModel {
    private final Coordinates coord;
    private final List<ListData> list;

    public CurrentAirPollutionModel(Coordinates coord, List<ListData> list) {
        this.coord = coord;
        this.list = list;
    }

    public Coordinates getCoord() {
        return coord;
    }

    public List<ListData> getList() {
        return list;
    }

    private static class ListData {
        private final Main main;
        private final Components components;
        private final long dt;

        public ListData(Main main, Components components, long dt) {
            this.main = main;
            this.components = components;
            this.dt = dt;
        }

        public Main getMain() {
            return main;
        }

        public Components getComponents() {
            return components;
        }

        public long getDt() {
            return dt;
        }

        private static class Main {
            private final int aqi;

            public Main(int aqi) {
                this.aqi = aqi;
            }

            public int getAqi() {
                return aqi;
            }
        }

        private static class Components {
            private final double co;
            private final double no;
            private final double no2;
            private final double o3;
            private final double so2;
            private final double pm2_5;
            private final double pm10;
            private final double nh3;

            public Components(double co, double no, double no2, double o3, double so2, double pm2_5, double pm10, double nh3) {
                this.co = co;
                this.no = no;
                this.no2 = no2;
                this.o3 = o3;
                this.so2 = so2;
                this.pm2_5 = pm2_5;
                this.pm10 = pm10;
                this.nh3 = nh3;
            }

            public double getCo() {
                return co;
            }

            public double getNo() {
                return no;
            }

            public double getNo2() {
                return no2;
            }

            public double getO3() {
                return o3;
            }

            public double getSo2() {
                return so2;
            }

            public double getPm2_5() {
                return pm2_5;
            }

            public double getPm10() {
                return pm10;
            }

            public double getNh3() {
                return nh3;
            }
        }
    }
}
