public class Adapter implements Sensor {
    private final SensorF sensor;

    public Adapter(SensorF sensor) {
        this.sensor = sensor;
    }

    @Override
    public double celsius() {
        return (sensor.fahrenheit() - 32) * 5.0 / 9.0;
    }
}
