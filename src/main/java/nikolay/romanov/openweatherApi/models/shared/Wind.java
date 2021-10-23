package nikolay.romanov.openweatherApi.models.shared;

public class Wind {
    private final double speed;
    private final int deg;
    private final double gust;

    public Wind(double speed, int deg, double gust) {
        this.speed = speed;
        this.deg = deg;
        this.gust = gust;
    }

    public double getSpeed() {
        return speed;
    }

    public int getDeg() {
        return deg;
    }

    public double getGust() {
        return gust;
    }
}
