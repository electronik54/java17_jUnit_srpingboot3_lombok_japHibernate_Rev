package com.electronik54.revision_3.corejava.ch117_junit5_basics.solution;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 tests for Calculator (Challenge 117).
 */
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    @DisplayName("Addition returns the sum")
    void addTest() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtractTest() {
        assertEquals(1, calculator.subtract(5, 4));
    }

    @Test
    void multiplyTest() {
        assertEquals(20, calculator.multiply(4, 5));
        assertTrue(calculator.multiply(0, 10) == 0);
    }

    @Test
    void divideTest() {
        assertEquals(2, calculator.divide(10, 5));
        // Division by zero throws
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }
}