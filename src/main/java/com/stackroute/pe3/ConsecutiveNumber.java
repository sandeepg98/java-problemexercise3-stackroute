package com.stackroute.pe3;

public class ConsecutiveNumber {

    public static String checkConsecutiveNumbers(String inputString) {

        //Split the input string to get a numbers array
        String[] numbers = inputString.split(" ");

        //Calculate the difference between the value of elemnents of given string
        for(int i=1; i<numbers.length; i++) {
            if(Integer.parseInt(numbers[i])-Integer.parseInt(numbers[i-1]) != 1)
                return "not consecutive";
        }

        return "consecutive";
    }
}