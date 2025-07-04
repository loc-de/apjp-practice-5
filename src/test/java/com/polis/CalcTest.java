package com.polis;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    @Tag("exception")
    void divideByZero_shouldThrowException() {
        assertThrows(ArithmeticException.class, () -> Calc.divide(1, 0));
    }

    @Test
    @Tag("equals")
    void dividePositiveNumbers() {
        assertEquals(5, Calc.divide(10, 2));
    }

    @Test
    @Tag("equals")
    void divideNegativeNumbers() {
        assertEquals(5, Calc.divide(-10, -2));
    }

    @ParameterizedTest
    @Tag("equals")
    @CsvSource({
        "6, 3, 2",
        "15, 5, 3",
        "-12, -4, 3"
    })
    void divideVariousInputs(int a, int b, int expected) {
        assertEquals(expected, Calc.divide(a, b));
    }

    @Test
    @Tag("notEquals")
    void divideWithAssume() {
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
        assertNotEquals(3, Calc.divide(10, -2));
    }

    @Test
    @Tag("notEquals")
    void divideNotEquals() {
        assertNotEquals(0, Calc.divide(1, 1));
    }
}