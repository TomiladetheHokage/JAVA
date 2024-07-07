package TV;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    @Test
    public void testTvCanOn(){
        Television tv = new Television();
        tv.turnOn();
        assertEquals("true", tv.tvState());

    }


}