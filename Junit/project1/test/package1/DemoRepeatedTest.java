package package1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTest {

    @BeforeEach
    void beforeEachMethod() {
        calculator = new Calculator();
    }

    Calculator calculator;   // declaring but not defining the variable

    @RepeatedTest(value = 5, name = "{displayName}. repetition {currentRepetition} of "
            + "{totalRepetitions}")
    @DisplayName("division by 0")
//    @Disabled("todo: still need to work on it")
    void testIntegerDivision_DivideByZero_ShouldGiveArithmeticException(
            RepetitionInfo repetitionInfo,
            TestInfo testInfo
    ){
        System.out.println("current repetition #: " + repetitionInfo.getCurrentRepetition());
        System.out.println(testInfo);
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
}
