package com.stackroute.pe3;

public class RemoveVowels {

    public static String[] removeVowels (String[] places){

        for (int i = 0; i < places.length; i++) {
            places[i] = places[i].replaceAll("[aeiouAEIOU]", "");
        }
        return places;
    }
}
