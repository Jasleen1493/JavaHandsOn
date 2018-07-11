package com.testPractise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionsDemo {

    @Test
    void standardAssertions(){
        assertEquals(2,2);
        assertEquals(2, 1+1, "Sum result");
    }
}
