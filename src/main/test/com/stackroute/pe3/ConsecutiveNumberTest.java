package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;


public class ConsecutiveNumberTest {

    ConsecutiveNumber object = new ConsecutiveNumber();

    @Test
    public void givenInputIsConsecuitveShouldReturnMessage()
    {
        String output = object.checkConsecutiveNumbers("1 2 3 4 5");
        assertEquals("consecutive", output);
    }
    @Test
    public void givenInputIsNotConsecuitveShouldReturnMessage()
    {
        String output = object.checkConsecutiveNumbers("1 2 3 4 4");
        assertEquals("not consecutive", output);
    }
}