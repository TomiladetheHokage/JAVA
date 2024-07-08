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

    @Test
    public void testTvCanNotIncreaseAbove2(){
        Television tv = new Television();
        tv.turnOn();
        tv.increasetVolume();
        tv.increasetVolume();
        tv.increasetVolume();
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> tv.increasetVolume());
        assertEquals("Volume must be between 0 and 100", exception.getMessage());
    }

    @Test
    public void testTvCanDecreaseVoulme(){
        Television tv = new Television();
        tv.turnOn();
        tv.increasetVolume();
        tv.decreaseVolume();
        assertEquals(0, tv.getVolume());
    }

    @Test
    public void testTvCanDecreaseVoulmeWhenTvIsOff(){
        Television tv = new Television();
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> tv.decreaseVolume());
        assertEquals("Tv is off", exception.getMessage());
    }

    @Test
    public void testTvCanNotDecreaseBelow0(){
        Television tv = new Television();
        tv.turnOn();
        tv.decreaseVolume();
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> tv.decreaseVolume());
        assertEquals("Volume must be between 0 and 100", exception.getMessage());
    }

    @Test
    public void testTvCanNotGetVolumeWhenTvIsOff(){
        Television tv = new Television();
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> tv.getVolume());
        assertEquals("Tv is off", exception.getMessage());
    }

    @Test
    public void testTvCanMute(){
        Television tv = new Television();
        tv.turnOn();
        tv.mute();
        assertEquals(true, tv.muteState());
    }

    @Test
    public void testTvCanNotMuteWhenTvIsff(){
        Television tv = new Television();
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> tv.mute());
        assertEquals("Tv is off", exception.getMessage());
    }

    @Test
    public void testTvCanUnmute(){
        Television tv = new Television();
        tv.turnOn();
        tv.mute();
        assertEquals(true, tv.muteState());
    }

    @Test
    public void testTvCanNotUnmuteWhenTvIsOff(){
        Television tv = new Television();
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> tv.unMute());
        assertEquals("Tv is off", exception.getMessage());
    }

    @Test
    public void testTvCanChangeChannel(){
        Television tv = new Television();
        tv.turnOn();
        tv.changeChanel(5);
        assertEquals(5,tv.getChannel());
    }

    @Test
    public void testTvCanNotChangeChannelWhenTvIsOff(){
        Television tv = new Television();
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> tv.changeChanel(5));
        assertEquals("Tv is off", exception.getMessage());
    }



}