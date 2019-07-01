package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixAdditionTest {

    MatrixAddition object;

    @Before
    public void setUp() {
        object = new MatrixAddition();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void addMatricesWithPositiveInput() {
        int result[][] = object.addMatrices(3,2, new int[][] {{1,2},{3,4},{5,6}},new int[][] {{9,8},{7,6},{5,4}});
        assertArrayEquals(new int[][]{{10,10},{10,10},{10,10}},result);

    }

    @Test
    public void  addMatricesEithNegativeNumbers() {
        int result[][] = object.addMatrices(3,2, new int[][] {{1,2},{3,4},{5,6}},new int[][] {{-9,8},{-7,6},{5,-4}});
        assertArrayEquals(new int[][]{{-8,10},{-4,10},{10,2}},result);
    }
}