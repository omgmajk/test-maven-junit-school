package com.jensen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Suite: Calculator.java")
class CalculatorTest {

    private final ByteArrayOutputStream outputStreamCap = new ByteArrayOutputStream();

    Calculator calc = new Calculator();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCap));
    }

    @Test
    void testSettingGetting() {
        Calculator calc2 = new Calculator();
        calc2.setFirstValue(10);
        calc2.setSecondValue(20);
        calc2.setResult(calc2.getFirstValue() + calc2.getSecondValue());

        assertAll("Testing getters and setters",
                () -> assertEquals(10, calc2.getFirstValue()),
                () -> assertEquals(20, calc2.getSecondValue()),
                () -> assertEquals(30, calc2.getResult())
        );
    }

    @Test
    void outputTestAdder() {
        calc.Adder(1.0, 2.0);
        assertEquals("Result:3.0", outputStreamCap.toString().trim());
    }

    @Test
    void outputTestSubtract() {
        calc.Subtract(3.0, 1.0);
        assertEquals("Result:2.0", outputStreamCap.toString().trim());
    }

    @Test
    void outputTestMultiply() {
        calc.Multiply(3, 3);
        assertEquals("Result:9.0", outputStreamCap.toString().trim());
    }

    @Test
    void outputTestDivision() {
        calc.Division(8, 2);
        assertEquals("Result:4.0", outputStreamCap.toString().trim());
    }

    @Test
    void outputTestExecuteAdder() {
        Calculator exCalc = new Calculator();

        exCalc.setFirstValue(9);
        exCalc.setSecondValue(3);

        assertEquals(12.0, exCalc.execute('a'));
        assertEquals("Result:12.0", outputStreamCap.toString().trim());
    }

    @Test
    void outputTestExecuteSubtract() {
        Calculator exCalc = new Calculator();

        exCalc.setFirstValue(9);
        exCalc.setSecondValue(3);

        assertEquals(6.0, exCalc.execute('s'));
        assertEquals("Result:6.0", outputStreamCap.toString().trim());
    }

    @Test
    void outputTestExecuteMultiply() {
        Calculator exCalc = new Calculator();

        exCalc.setFirstValue(9);
        exCalc.setSecondValue(3);

        assertEquals(27.0, exCalc.execute('m'));
        assertEquals("Result:27.0", outputStreamCap.toString().trim());
    }

    @Test
    void outputTestExecuteDivision() {
        Calculator exCalc = new Calculator();

        exCalc.setFirstValue(9);
        exCalc.setSecondValue(3);

        assertEquals(3.0, exCalc.execute('d'));
        assertEquals("Result:3.0", outputStreamCap.toString().trim());
    }

    @Test
    void outputTestExecuteDefault() {
        assertEquals(0.0, calc.execute('k'));
        assertEquals("Invalid opCode:k", outputStreamCap.toString().trim());
    }
}