package package1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

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

    @ParameterizedTest
//    @MethodSource("integerSubtractionMethodParameters")
    @CsvSource({
            "33, 1, 32",
            "14, 1, 13",
            "0, 1, -1"
    })
    @CsvFileSource(resources = "/integerSubtraction.csv")
    @DisplayName("test 33 - 1 = 32")
    void TestIntegerSubtraction_zeroAndMinusTwo_GivesTwo(int minuend, int subtrahend, int expectedResult) {

        // arrange
//        int minuend = 0, subtrahend = -2, expectedResult = minuend - subtrahend;
        // act
        int actualResult = calculator.integerSubtraction(minuend,subtrahend);
        // assert
        assertEquals(expectedResult, actualResult,
                () -> minuend + " - " + subtrahend + " did not produce " + expectedResult);
    }

    private static Stream<Arguments> integerSubtractionMethodParameters() {

        return Stream.of(
                Arguments.of(33, 1, 32),
                Arguments.of(14, 1, 13),
                Arguments.of(0, 1, -1)
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {"john", "kate", "alice"})
    void valueSourceDemonstration(String firstName) {
        System.out.println(firstName);
        assertNotNull(firstName);
    }
}