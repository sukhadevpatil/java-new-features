package com.core.concepts.newfeatures.java16;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayPeriod {

    /**
     *  new addition to the DateTimeFormatter is the period-of-day symbol “B“,
     *  which provides an alternative to the am/pm format
     * @param args
     */
    public static void main(String[] args) {
        LocalTime time = LocalTime.parse("15:25:08.690791");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");
        System.out.println(time.format(formatter));

        formatter = DateTimeFormatter.ofPattern("h BBBBB");
        System.out.println(time.format(formatter));
    }
}
