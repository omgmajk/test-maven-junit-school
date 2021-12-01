package com.jensen;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book("NOS4A2", 400, "Joe Hill");

    @Test
    void testGetTitle() {
        assertEquals("NOS4A2", book.getTitle());
    }

    @Test
    void testSetTitle() {
        book.setTitle("Something Wicked This Way Comes");
        assertEquals("Something Wicked This Way Comes", book.getTitle());

        Throwable e = assertThrows(IllegalArgumentException.class,
                () -> book.setTitle("")
        );
        assertEquals("Title most include characters", e.getMessage());
        // Check that the title didn't change
        assertTrue(book.getTitle().contains("Something"));
    }

    @DisplayName("Testing null title")
    @Test
    // Getting around the setTitle null check
    void testNullTitle() {
        Book book2 = new Book(null, 200, null);
        // Could be simplified with assertNull.
        assertTrue(book2.getTitle() == null);
    }

    @Test
    void testGetAuthor() { assertEquals("Joe Hill", book.getAuthor()); }

    @Test
    void testSetAuthor() {
        book.setAuthor("Stephen King");
        assertEquals("Stephen King", book.getAuthor());
    }

    @Test
    void testGetPages() { assertEquals(400, book.getPages()); }

    @Test
    void testSetPages() {
        book.setPages(666);
        assertEquals(666, book.getPages());

        // Set negative pages
        Throwable e = assertThrows(IllegalArgumentException.class,
                () -> book.setPages(-1)
        );
        assertEquals("Pages can´t be negative", e.getMessage());
    }
}