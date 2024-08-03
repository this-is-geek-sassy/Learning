package package1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("test math operations in calculator class")
class CalculatorTest {

    @BeforeAll
    static void setup() {
//        Calculator calculator;
        System.out.println("executing @beforeall annotation");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("executing @afterall annotation");
    }
    @BeforeEach
    void beforeEachMethod() {
        calculator = new Calculator();
    }

    Calculator calculator;   // declaring but not defining the variable

    // test method naming convention:
    // test<system under test>_<condition or state change>_<expected result>

    @Test
    @DisplayName("Test 4/2 = 2")
    void testIntegerDivision_4Divides2_Gives2() {
//        fail("no implementation provided");    // unconditional fail assertion

        int result = calculator.integerDivision(4, 2);
        assertEquals(2, result, () -> "expected 2, got " + result);
    }

    @Test
    @DisplayName("division by 0")
//    @Disabled("todo: still need to work on it")
    void testIntegerDivision_DivideByZero_ShouldGiveArithmeticException(){
        // arrange
        int dividend = 4;
        int divisor = 0;
        String expectedExceptionMessage = "/ by zero";

        // act & assert
        ArithmeticException actualException = assertThrows(ArithmeticException.class, () -> {
            // act
            calculator.integerDivision(dividend, divisor);
        }, "division by 0 should have thrown arithmetic exception");

        // assert
        assertEquals(expectedExceptionMessage, actualException.getMessage(), "Unexpected exception message");
    }

    @Test
    @DisplayName("test 33 - 1 = 32")
    void TestIntegerSubtraction_zeroAndMinusTwo_GivesTwo() {

        // arrange
        int minuend = 0, subtrahend = -2, expectedResult = minuend - subtrahend;
        // act
        int actualResult = calculator.integerSubtraction(minuend,subtrahend);
        // assert
        assertEquals(expectedResult, actualResult,
                () -> minuend + " - " + subtrahend + " did not produce " + expectedResult);
    }
}