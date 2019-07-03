package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessPatternTest {
    ChessPattern object;

    @Before
    public void setUp() {
        object = new ChessPattern();
    }

    @After
    public void tearDown()  {
        object = null;
    }

    //Test case for rows and columns equal to 4
    @Test
    public void givenInputShouldReturnMessage()
    {
        object.matrixInitialise(4);
        String result=object.chessBoard();
        assertEquals("BB Ww BB Ww \n" +
                              "BB Ww BB Ww \n" +
                              "BB Ww BB Ww \n" +
                              "BB Ww BB Ww \n", result);
    }

}
