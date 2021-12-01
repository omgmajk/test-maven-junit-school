package com.jensen;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Suite: Calculator2.java")
class Calculator2Test {

    Calculator2 calc = new Calculator2();

    @Test
    @Order(1)
    void testAdd() {
        assertEquals(6, calc.add(3,3));
        assertEquals(1, calc.getCounter());
    }

    @Test
    @Order(2)
    void testSubtract() {
        assertEquals(0, calc.subtract(3,3));
        assertEquals(2, calc.getCounter());
    }

    @Test
    @Order(3)
    void testMultiply() {
        assertEquals(9, calc.multiply(3,3));
        assertEquals(3, calc.getCounter());
    }

    @Test
    @Order(4)
    void testDivide() {
    }

    @Test
    @Order(5)
    void testReverse() {
    }

    @Test
    @Order(6)
    void testQuote() {
    }

    @Test
    @Order(7)
    void testGetCounter() {
    }
}