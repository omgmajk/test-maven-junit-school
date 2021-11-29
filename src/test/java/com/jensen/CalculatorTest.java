package com.jensen;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCap = new ByteArrayOutputStream();

    Calculator calc = new Calculator();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCap));
    }

    @Test
    void outputTestAdder() {
        calc.Adder(1.0, 2.0);
        Assert.assertEquals("Result:3.0", outputStreamCap.toString().trim());
    }
    @Test
    void outputTestSubtract() {
        calc.Subtract(3.0, 1.0);
        Assert.assertEquals("Result:2.0", outputStreamCap.toString().trim());
    }

}