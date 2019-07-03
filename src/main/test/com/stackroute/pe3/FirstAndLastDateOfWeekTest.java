package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDateOfWeekTest {

    FirstAndLastDateOfWeek object;

    @Before
    public void setUp() {
        object = new FirstAndLastDateOfWeek();
    }

    @After
    public void tearDown()  {
        object = null;
    }


    //To test 1st day of week
    @Test
    public void firstDayOfWeek() {
        String output = object.firstDayOfWeek();
        assertEquals("Mon 1 6 2019", output);
    }

    //To test last day of week
    @Test
    public void lastDayOfWeek() {
        String output = object.lastDayOfWeek();
        assertEquals("Sun 7 6 2019", output);
    }
}