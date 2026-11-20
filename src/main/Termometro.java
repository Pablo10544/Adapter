public class Termometro {
    private final Sensor sensor;

    public Termometro(Sensor sensor) {
        this.sensor = sensor;
    }

    public double ler() {
        return sensor.celsius();
    }
}
