package com.stackroute.pe3;

public class ConsecutiveNumber {

    public static String checkConsecutiveNumbers(String inputString) {
        String[] numbers = inputString.split(" ");

        for(int i=1; i<numbers.length; i++) {
            if(Integer.parseInt(numbers[i])-Integer.parseInt(numbers[i-1]) != 1)
                return "not consecutive";
        }

        return "consecutive";
    }
}