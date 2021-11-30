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

    @Test
    void testSetTitle() {
        book.setTitle("Something Wicked This Way Comes");
        Assert.assertEquals("Something Wicked This Way Comes", book.getTitle());

        Throwable e = assertThrows(IllegalArgumentException.class,
                () -> book.setTitle("")
        );
        Assert.assertEquals("Title most include characters", e.getMessage());
        // Check that the title didn't change
        Assert.assertTrue(book.getTitle().contains("Something"));
    }

    @Test
    // Getting around the setTitle null check
    void testNullSetTitle() {
        Book book2 = new Book(null, 200, null);
        Assert.assertTrue(book2.getTitle() == null);
    }

    @Test
    void testGetAuthor() { Assert.assertEquals("Joe Hill", book.getAuthor());}

    @Test
    void testSetAuthor() {
        book.setAuthor("Stephen King");
        assertEquals("Stephen King", book.getAuthor());
    }
    @Test
    // Casting necessary due to ambiguous method (obj, obj or long, long) error.
    void testGetPages() { Assert.assertEquals(400, (int) book.getPages()); }
}