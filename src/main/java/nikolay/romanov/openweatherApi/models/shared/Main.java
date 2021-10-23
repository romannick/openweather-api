package nikolay.romanov.openweatherApi.models.shared;

public class Main {
    private final double temp;
    private final double feels_like;
    private final double temp_min;
    private final double temp_max;
    private final double pressure;
    private final int sea_level;
    private final int grnd_level;
    private final double humidity;
    private final double temp_kf;

    public Main(double temp, double feels_like, double temp_min, double temp_max, double pressure, int sea_level, int grnd_level, double humidity, double temp_kf) {
        this.temp = temp;
        this.feels_like = feels_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.sea_level = sea_level;
        this.grnd_level = grnd_level;
        this.humidity = humidity;
        this.temp_kf = temp_kf;
    }

    public double getTemp() {
        return temp;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public double getPressure() {
        return pressure;
    }

    public int getSea_level() {
        return sea_level;
    }

    public int getGrnd_level() {
        return grnd_level;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getTemp_kf() {
        return temp_kf;
    }
}
