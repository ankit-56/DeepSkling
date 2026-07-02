package com.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals("Addition failed", 5, 2 + 3);
        assertTrue("Expected true condition", 5 > 3);
        assertFalse("Expected false condition", 5 < 3);

        String str = null;
        assertNull("Expected null", str);

        String message = "Hello";
        assertNotNull("Expected not null", message);
    }
}