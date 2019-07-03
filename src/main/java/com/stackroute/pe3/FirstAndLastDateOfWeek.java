package com.stackroute.pe3;

import java.util.Calendar;

public class FirstAndLastDateOfWeek {

    Calendar cal = Calendar.getInstance();

    //To calculate first day of the week
    public String firstDayOfWeek(){
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return ("Mon" + " " + cal.get(Calendar.DATE) + " " + cal.get(Calendar.MONTH) + " " + cal.get(Calendar.YEAR));
    }

    //To calculate last day of the week
    public String lastDayOfWeek(){
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        cal.add(Calendar.DAY_OF_WEEK,6);
        return ("Sun" + " " + cal.get(Calendar.DATE) + " " + cal.get(Calendar.MONTH) + " " + cal.get(Calendar.YEAR));
    }
}
