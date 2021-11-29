package com.jensen;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book("NOS4A2", 400, "Joe Hill");

    @Test
    void testGetTitle() {
        Assert.assertEquals("NOS4A2", book.getTitle());
    }
}