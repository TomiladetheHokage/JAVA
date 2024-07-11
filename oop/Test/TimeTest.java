import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    public void testTimeObjectIsSetToDefaultState() {
        Time t = new Time(23, 59, 59);
        assertEquals(23, t.getHour());
        assertEquals(59, t.getMinute());
        assertEquals(59, t.getSecond());
    }

    @Test
    public void testTimeObjectIsSetToSetTime() {
        Time t = new Time();
        t.setTime(9,9,9);
        assertEquals(9, t.getHour());
        assertEquals(9, t.getMinute());
        assertEquals(9, t.getSecond());
    }

    @Test
    public void testTimeCanThrowExceptionWhenSecondIsWrong() {
        Time t = new Time();
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () ->t.setTime(23, 59, 60));{
            assertEquals("Invalid second", e.getMessage());
        }
    }

}