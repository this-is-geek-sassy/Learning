package org.saswata;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

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

    @org.jetbrains.annotations.NotNull
    private static Stream<Arguments> testIntegerSubtraction() {
        return Stream.of(
                Arguments.of(33, 1, 32),
                Arguments.of(54, 1, 53),
                Arguments.of(23, 1, 22),
                Arguments.of(0, 1, -1)
        );
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
//    @Disabled("Todo: still need to work")
    void testIntegerDivision_WhenDividendISDividedByZero_ShouldThrowArithmeticException() {
        System.out.println("Performing division by zero");
//        Calculator calculator = new Calculator();

        // Arrange
        int dividend= 4;
        int divisor = 0;
        String expectedExceptionMessage = "/ by zero";

        // Act && Assert
        ArithmeticException actualException = assertThrows(ArithmeticException.class, () -> {
            Object result = calculator.integerDivision(dividend, divisor);
        }, "division by 0 should have thrown arithmetic exception");

        // Assert
        assertEquals(expectedExceptionMessage, actualException.getMessage(), "unexpected exception message");
    }

    @DisplayName("test integer subtraction")
    @ParameterizedTest
//    @MethodSource("integerSubtractionInputParameters")
//    @MethodSource
//    @CsvSource( {
//            "33, 1, 32",
//            "24, 1, 23",
//            "54, 1, 53",
////            "0, 1, -1"
//    } )
    @CsvFileSource(resources = "/integerSubtraction.csv")
    public void testIntegerSubtraction(int minuend, int subtrahend, int expectedResult) {
        System.out.println("Performing " + minuend + "-" + subtrahend + "=" + expectedResult);
//        Calculator calculator = new Calculator();
//        int minuend = 33;
//        int subtrahend = 1;
//        int expectedResult = 32;
        int actualResult = calculator.integerSubtraction(minuend, subtrahend);
        assertEquals(expectedResult, actualResult,
                () -> minuend + " and " + subtrahend + " did not produce " +
                    expectedResult + ". It produced: " + actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"John", "Kate", "Alice"})
    void valueSourceDemonstration(String firstName) {
        System.out.println(firstName);
        assertNotNull(firstName);
    }
}