package package1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    // test method naming convention:
    // test<system under test>_<condition or state change>_<expected result>

    @Test
    void testIntegerDivision_4Divides2_Gives2() {
//        fail("no implementation provided");    // unconditional fail assertion

        int result = calculator.integerDivision(4, 2);
        assertEquals(2, result, () -> "expected 2, got " + result);
    }

    @Test
    void testIntegerDivision_DivideByZero_ShouldGiveArithmeticException(){
        
    }

    @Test
    void TestIntegerSubtraction_zeroAndMinusTwo_GivesTwo() {

        int minuend = 0, subtrahend = -2, expectedResult = minuend - subtrahend;
        int actualResult = calculator.integerSubtraction(minuend,subtrahend);
        assertEquals(expectedResult, actualResult,
                () -> minuend + " - " + subtrahend + " did not produce " + expectedResult);
    }
}