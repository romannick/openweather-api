package nikolay.romanov.openweatherApi.models.shared;

public class Clouds {
    private final int all;

    public Clouds(int all) {
        this.all = all;
    }

    public int getAll() {
        return all;
    }
}
