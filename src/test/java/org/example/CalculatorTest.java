package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(4, calc.Add(2, 2), "2 + 2 = 4 olmalı");
    }

    @Test
    void testDivision() {
        assertEquals(3, calc.Divide(6, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.Divide(10, 0));
    }
}