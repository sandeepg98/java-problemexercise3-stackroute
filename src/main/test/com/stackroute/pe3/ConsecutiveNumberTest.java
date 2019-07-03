package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ConsecutiveNumberTest {

    ConsecutiveNumber object;

    @Before
    public void setUp() {
        object = new ConsecutiveNumber();
    }

    @After
    public void tearDown()  {
        object = null;
    }

    //When numbers are consecuitive
    @Test
    public void givenInputIsConsecuitveShouldReturnMessage()
    {
        String output = object.checkConsecutiveNumbers("1 2 3 4 5");
        assertEquals("consecutive", output);
    }

    //When numbers are not consecuitive
    @Test
    public void givenInputIsNotConsecuitveShouldReturnMessage()
    {
        String output = object.checkConsecutiveNumbers("1 2 3 4 4");
        assertEquals("not consecutive", output);
    }
}