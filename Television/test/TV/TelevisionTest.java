package TV;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    @Test
    public void testTvCanOn(){
        Television tv = new Television();
        tv.turnOn();
        assertEquals(true, tv.tvState());
    }

    @Test
    public void testTvCanOff(){
        Television tv = new Television();
        tv.turnOff();
        assertEquals(false, tv.tvState());
    }

    @Test
    public void testTvCanIncreaseVoulme(){
        Television tv = new Television();
        tv.turnOn();
        tv.increasetVolume();
        assertEquals(1, tv.getVolume());
    }

    @Test
    public void testTvCanNotIncreaseVolumeWhenTvIsOff(){
        Television tv = new Television();
        tv.turnOff();
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> tv.increasetVolume());
        assertEquals("Tv is off", exception.getMessage());
    }


}