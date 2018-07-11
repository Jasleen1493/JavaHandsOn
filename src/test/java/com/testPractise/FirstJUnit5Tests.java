package com.testPractise;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class FirstJUnit5Tests {

    @Test
    public void myFirstTest(){
        assertEquals(2,1+1);
    }

}
