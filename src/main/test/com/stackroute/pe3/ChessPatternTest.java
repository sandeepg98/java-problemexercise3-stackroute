package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessPatternTest {
    ChessPattern ob = new ChessPattern();

    @Test
    public void givenInputShouldReturnMessage()
    {
        ob.matrixInitialise(4);
        String result=ob.chessBoard();
        assertEquals("BB Ww BB Ww \n" +
                              "BB Ww BB Ww \n" +
                              "BB Ww BB Ww \n" +
                              "BB Ww BB Ww \n", result);
    }

}
