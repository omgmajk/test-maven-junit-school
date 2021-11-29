package com.jensen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {
    public Cup cup = new Cup("coke", 10.0);

    @Test
    void testGetLiquidType() {
        assertEquals("coke", cup.getLiquidType());
        assertNotEquals("Coke", cup.getLiquidType());
    }
    @Test
    void testSetLiquidType() {
        cup.setLiquidType("coffee");
        assertEquals("coffee", cup.getLiquidType());
    }
    @Test
    void testGetPercentFull() {
        assertEquals(10.0, cup.getPercentFull());
    }
    @Test
    void testSetPercentFull() {
        cup.setPercentFull(0.1 + 0.2);
        assertEquals(0.3, cup.getPercentFull(), 0.0000001); // Delta needed since there are rounding errors

        // Test exception handling
        Throwable e = assertThrows(IllegalArgumentException.class,
                () -> cup.setPercentFull(-1)
        );
        Throwable e2 = assertThrows(IllegalArgumentException.class,
                () -> cup.setPercentFull(200)
        );
        assertTrue(e.getMessage().contains("Percent must be"));
        assertEquals("Percent must be >=0 and <= 100", e.getMessage());
    }
    @Test
    void testAll() {
        Cup newCup = new Cup("coffee", 15.0);
        assertAll("Object is created",
                () -> assertEquals("coffee", newCup.getLiquidType()),
                () -> assertEquals(15.0, newCup.getPercentFull())
        );
    }
}