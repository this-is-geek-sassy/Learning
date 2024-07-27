package package1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void integerDivisionTest() {
//        fail("no implementation provided");    // unconditional fail assertion

        int result = calculator.integerDivision(4, 2);
        assertEquals(2, result, "expected 2, got " + result);
    }

    @Test
    void integerSubtractionTest() {
        int result = calculator.integerSubtraction(0,-2);
        assertEquals(2, result);
    }
}