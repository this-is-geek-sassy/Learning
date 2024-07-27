package package1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void integerDivision() {
//        fail("no implementation provided");
        Calculator calculator = new Calculator();

        int result = calculator.integerDivision(4, 2);
        assertEquals(2, result);
    }
}