package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void init() {
//        System.out.println("before each");
        // prima di ogni test inizializzo calculator
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test addizione")
    void add() {
        float result = calculator.add(2, 5);
        Assertions.assertEquals(7, result);
    }

    @Test
    @DisplayName("Test sottrazione")
    void subtract() {
        float result = calculator.subtract(3, 2);
        Assertions.assertEquals(1, result);
    }

    @Test
    @DisplayName("Test divisione")
    void divide() {
        float result = calculator.divide(6, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("Test divisione per zero")
    void divideToZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }


    @Test
    @DisplayName("Test moltiplicazione")
    void multiply() {
        float result = calculator.multiply(3, 3);
        Assertions.assertEquals(9, result);
    }
}