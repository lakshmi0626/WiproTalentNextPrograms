package com.Collection;
import java.time.LocalDate;

public class LeapYearCheck {
    public static void main(String[] args) {

        // Get the current year
        int year = LocalDate.now().getYear();

        // Check if it is a leap year
        if (LocalDate.now().isLeapYear()) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }
    }
}