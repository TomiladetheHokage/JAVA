package Okada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OkadaTest {

    @Test
    public void testThatBikeCanOn() {
        Okada bike = new Okada();
        bike.turnOn();
        assertTrue(bike.isOn());

    }

    @Test
    public void testThatBikeCanOff() {
        Okada bike = new Okada();
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void testThatBikeCanAccelerateInGear1() {
        Okada bike = new Okada();
        bike.turnOn();
        bike.accelerateGear1();
        assertEquals(1, bike.getCurrentSpeed());
    }

    @Test
    public void testThatBikeCanAccelerateInGear2() {
        Okada bike = new Okada();
        bike.turnOn();
        for (int counter = 0; counter < 21; counter++) {
            bike.accelerateGear1();
        }
        bike.accelerateGear2();
        assertEquals(23, bike.getCurrentSpeed());
    }

    @Test
    public void testThatBikeCanAccelerateInGear3() {
        Okada bike = new Okada();
        bike.turnOn();
        for (int counter = 0; counter < 31; counter++) {
            bike.accelerateGear1();
        }
        bike.accelerateGear3();
        assertEquals(34, bike.getCurrentSpeed());
    }

    @Test
    public void testThatBikeCanAccelerateInGear4() {
        Okada bike = new Okada();
        bike.turnOn();
        // bike.accelerateGear4();
        for (int counter = 0; counter < 41; counter++) {
            bike.accelerateGear1();
        }
        bike.accelerateGear4();
        assertEquals(45, bike.getCurrentSpeed());
    }
}

