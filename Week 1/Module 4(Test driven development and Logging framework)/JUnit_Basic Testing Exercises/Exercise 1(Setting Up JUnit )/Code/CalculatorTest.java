package com.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(10, calc.add(6, 4));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calc.subtract(6, 4));
    }

    @Test
    public void testMultiply() {
        assertEquals(24, calc.multiply(6, 4));
    }

    @Test
    public void testDivide() {
        assertEquals(3, calc.divide(12, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calc.divide(10, 0);
    }
}