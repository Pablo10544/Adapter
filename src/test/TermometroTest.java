import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TermometroTest {
    @Test
    void usaSensor() {
        Sensor sensor = () -> 22.5;
        Termometro termometro = new Termometro(sensor);

        assertEquals(22.5, termometro.ler(), 0.0001);
    }
}
