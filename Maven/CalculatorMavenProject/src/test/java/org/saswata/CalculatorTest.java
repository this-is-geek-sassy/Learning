package org.saswata;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test math operations in calculator class")
class CalculatorTest {

    public Calculator calculator;

    @BeforeAll
    static void setup() {
        System.out.println("executing setup for all testcases of calculator class");
    }
    @AfterAll
    static void cleanup() {
        System.out.println("performing cleanup of all resources after tests are performed");
    }

    @BeforeEach
    void BeforeEach() {
        System.out.println("executing @BeforeEach class");
        calculator = new Calculator();
    }
    @AfterEach
    void AfterEach() {
        System.out.println("executing @AfterEach class");
    }

    // test<System under test>_<Condition or state change>_<expected result>
    @DisplayName("test 4/2=2")
    @Test
    void testIntegerDivision_WhenFourIsDividedByTwo_ShouldReturnTwo() {
        System.out.println("Performing 4/2=2");
        // AAA
        // Arrange-Act-Assert  or Given-When-Then
//        Calculator calculator = new Calculator();
        int result = calculator.integerDivision(4, 2);
        assertEquals(2, result, "division not working");
        // unconditional fail assertions
//        fail("");
//        assertNotEquals();
//        assertTrue(<condition>);
//        many more assertions
    }

    @DisplayName("division by zero")
    @Test
    @Disabled("Todo: still need to work")
    void testIntegerDivision_WhenDividendISDividedByZero_ShouldThrowArithmeticException() {
//        Calculator calculator = new Calculator();
        System.out.println("Performing division by zero");
        Object result = calculator.integerDivision(20, 0);
    }

    @DisplayName("test 33-1=32")
    @Test
    public void integerSubtraction() {
        System.out.println("Performing 33-1=32");
//        Calculator calculator = new Calculator();
        int minuend = 33;
        int subtrahend = 1;
        int expectedResult = 32;
        int actualResult = calculator.integerSubtraction(minuend, subtrahend);
        assertEquals(expectedResult, actualResult,
                () -> minuend + " and " + subtrahend + " did not produce " +
                    expectedResult + ". It produced: " + actualResult);
    }
}