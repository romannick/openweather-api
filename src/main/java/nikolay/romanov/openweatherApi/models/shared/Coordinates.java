package nikolay.romanov.openweatherApi.models.shared;

public class Coordinates {
    private final double lon;
    private final double lat;

    public Coordinates(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public double getLat() {
        return lat;
    }
}
