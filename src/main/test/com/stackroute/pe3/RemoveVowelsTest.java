package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels object;

    @Before
    public void setUp() {
        object = new RemoveVowels();
    }

    @After
    public void tearDown() {
        object = null;
    }

    //When names have vowels in them
    @Test
    public void convertNamesHavingVowels() {
        String[] output = object.removeVowels(new String[] {"india","bangladesh","united states"});
        assertArrayEquals(new String[]{"nd","bngldsh","ntd stts"},output);
    }

    ////When names don't have vowels in them
    @Test
    public void convertNamesNotHavingVowels() {
        String[] output = object.removeVowels(new String[] {"xyz","srt","jkl"});
        assertArrayEquals(new String[]{"xyz","srt","jkl"},output);
    }
}