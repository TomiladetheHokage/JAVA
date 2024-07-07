package AirConditioner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void testAirConditionerIsOn() {
        AirConditioner ac = new AirConditioner();
        ac.onAc();
        assertTrue(ac.isOn());
    }

    @Test
    public void testAirConditionerIsOff() {
        AirConditioner ac = new AirConditioner();
        ac.offAc();
        assertFalse(ac.isOff());
    }

    @Test
    public void testAirConditionerCanOnAndOff() {
        AirConditioner ac = new AirConditioner();
        ac.offAc();
        assertFalse(ac.isOff());
        ac.onAc();
        assertTrue(ac.isOn());
    }

    @Test
    public void increaseTemperature() {
        AirConditioner ac = new AirConditioner();
        ac.onAc();
        ac.setTemperature(16);
        ac.increaseTemperature();
        assertEquals(17, ac.getTemperature());
    }

    @Test
    public void decreaseTemperature() {
        AirConditioner ac = new AirConditioner();
        ac.onAc();
        ac.setTemperature(25);
        ac.decreaseTemperature();
        assertEquals(24, ac.getTemperature());

    }

    @Test
    public void testAcCannotIncreaseMore30() {
        AirConditioner ac = new AirConditioner();
        ac.onAc();
        ac.setTemperature(40);
        ac.increaseTemperature();
        assertEquals(30, ac.getTemperature());
    }

    @Test
    public void testAcCannotDecreaseMore16() {
        AirConditioner Ac = new AirConditioner();
        Ac.onAc();
        for (int counter = 0; counter < 16; counter++) {
            Ac.decreaseTemperature();
        }
        assertEquals(16, Ac.getTemperature());
    }
}



