package com.sample.mySampleJavaCodes;

import java.util.Calendar;
import java.util.Date;

public class GetDate {


    public static Date main(String[] args) {

        Calendar calendar = Calendar.getInstance();
       // calendar.setTime(date);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return new Date(calendar.getTime().getTime());

    }

}
