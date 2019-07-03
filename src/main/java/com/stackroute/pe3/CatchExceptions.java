package com.stackroute.pe3;

public class CatchExceptions {

    public static void  main(String[] args)
    {
        //Catch NegativeArraySizeException Exception
        try{
            int[] arrayToBeTested = new int[-14];
        }
        catch (NegativeArraySizeException e) {
            e.printStackTrace();
        }

        //Catch ArrayIndexOutOfBoundsException Exception
        try{
            int[] arrayToBeTested=new int[2];
            arrayToBeTested[4]=12;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        //Catch NullPointerException Exception
        try{
            String stringToBeTested=null;
            stringToBeTested.indexOf('a');
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

}
