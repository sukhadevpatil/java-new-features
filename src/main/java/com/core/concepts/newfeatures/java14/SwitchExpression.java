package com.core.concepts.newfeatures.java14;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchExpression {

    //switch expressions have been standardized
    //this feature can now be used in production code
    public static void main(String[] args) {
        //Older way
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String day = dayOfWeek.name();
        boolean isTodayHoliday;
        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                isTodayHoliday = false;
                break;
            case "SATURDAY":
            case "SUNDAY":
                isTodayHoliday = true;
                break;
            default:
                throw new IllegalArgumentException("What's a " + day);
        }
        System.out.println(isTodayHoliday);
        System.out.println("============================================");

        //With switch expressions, we can write the same thing more succinctly
        isTodayHoliday = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
            case "SATURDAY", "SUNDAY" -> true;
            default -> throw new IllegalArgumentException("What's a " + day);
        };

        System.out.println(isTodayHoliday);

    }
}
