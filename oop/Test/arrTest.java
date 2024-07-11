import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class arrTest {
    @Test
    public void test() {
        arr arr = new arr();
        int [] numbers =  {4,5,9};

        boolean [] result = arr.convert(numbers);
        String answer = Arrays.toString(result);

        assertEquals(answer, arr.getArr(result));

    }

}