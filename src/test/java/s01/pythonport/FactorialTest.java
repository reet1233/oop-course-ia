package s01.pythonport;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    void factorialOfZeroAndSmallNumbers() {
        assertEquals(1L, Factorial.factorial(0));
        assertEquals(120L, Factorial.factorial(5));
    }

    @Test
    void factorialExceedingIntMaxValue() {
        // Would overflow if factorial used int instead of long
        assertEquals(6227020800L, Factorial.factorial(13));
    }
}