package com.jensen;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// So that we can run tests in order by using @Order(n)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

@DisplayName("Test Suite: Calculator2.java")
class Calculator2Test {

    Calculator2 calc = new Calculator2();

    String[] quotes = new String[]{
            "We cannot solve our problems with the same thinking we used when we created them. - Albert Einstein",
            "A fool thinks himself to be wise, but a wise man knows himself to be a fool. - William Shakespeare",
            "You must be the change you wish to see in the world. - Mahatma Gandhi",
            "In the End, we will remember not the words of our enemies, but the silence of our friends. - Martin Luther King, Jr.",
            "Choose a job you love, and you will never have to work a day in your life. - Confucius",
            "To expect the unexpected shows a thoroughly modern intellect. - Oscar Wilde",
            "Without music, life would be a mistake. - Friedrich Nietzsche",
            "I love deadlines. I like the whooshing sound they make as they fly by. - Douglas Adams"
    };

    @Test
    @Order(1)
    void testAdd() {
        assertEquals(6, calc.add(3, 3));
        assertEquals(1, calc.getCounter());
    }

    @Test
    @Order(2)
    void testSubtract() {
        assertEquals(0, calc.subtract(3, 3));
        assertEquals(2, calc.getCounter());
    }

    @Test
    @Order(3)
    void testMultiply() {
        assertEquals(9, calc.multiply(3, 3));
        assertEquals(3, calc.getCounter());
    }

    @Test
    @Order(4)
    void testDivide() {
        assertEquals(3, calc.divide(9, 3));
        assertEquals(4, calc.getCounter());
    }

    @Test
    @Order(5)
    void testReverse() {
        assertEquals("esrever", calc.reverse("reverse"));
        assertEquals(5, calc.getCounter());
    }

    @Test
    @Order(6)
    void testQuote() {
        List<String> allQuotes = Arrays.asList(quotes);
        assertTrue(allQuotes.contains(calc.quote()));
        assertEquals(6, calc.getCounter());
    }
}