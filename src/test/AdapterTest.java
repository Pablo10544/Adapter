import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdapterTest {
    @ParameterizedTest
    @CsvSource({
        "32, 0",
        "212, 100",
        "-40, -40",
        "98.6, 37"
    })
    void converte(double fahrenheit, double celsius) {
        Sensor sensor = new Adapter(new SensorF(fahrenheit));

        assertEquals(celsius, sensor.celsius(), 0.0001);
    }

    @Test
    void integra() {
        SensorF sensor = new SensorF(77);
        Termometro termometro = new Termometro(new Adapter(sensor));

        assertEquals(25, termometro.ler(), 0.0001);
        assertEquals(77, sensor.fahrenheit(), 0.0001);
    }
}
