package pro.sky.calculatorversiontwo.service;

import org.junit.jupiter.api.Test;
import pro.sky.calculatorversiontwo.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.calculatorversiontwo.costants.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnCorrectAdditionResult() {
        int result1 = Integer.parseInt(out.getPlus(TEST_NUM1, TEST_NUM1));
        assertEquals(TEST_NUM1 + TEST_NUM1, result1);
        int result2 = Integer.parseInt(out.getPlus(TEST_NUM2, TEST_NUM2));
        assertEquals(TEST_NUM2 + TEST_NUM2, result2);
    }

    @Test
    public void shouldReturnCorrectSubtractionResult() {
        int result1 = Integer.parseInt(out.getNegative(TEST_NUM1, TEST_NUM1));
        assertEquals(0, result1);
        int result2 = Integer.parseInt(out.getNegative(TEST_NUM2, TEST_NUM2));
        assertEquals(0, result2);
    }

    @Test
    public void shouldReturnCorrectMultiplicationResult() {
        int result1 = Integer.parseInt(out.getMultiply(TEST_NUM1, TEST_NUM1));
        assertEquals(TEST_NUM1 * TEST_NUM1, result1);
        int result2 = Integer.parseInt(out.getMultiply(TEST_NUM2, TEST_NUM2));
        assertEquals(TEST_NUM2 * TEST_NUM2, result2);
    }

    @Test
    public void shouldReturnCorrectDivisionResult() {
        double result1 = Double.parseDouble(out.getDivide(TEST_NUM1, TEST_NUM1));
        assertEquals((double)TEST_NUM1 / TEST_NUM1, result1);
        double result2 = Double.parseDouble(out.getDivide(TEST_NUM2, TEST_NUM2));
        assertEquals((double)TEST_NUM2 / TEST_NUM2, result2);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDivisorIsZero() {
        assertThrows(IllegalArgumentException.class,
                () -> out.getDivide(TEST_NUM1, ZERO)
        );
    }
}
