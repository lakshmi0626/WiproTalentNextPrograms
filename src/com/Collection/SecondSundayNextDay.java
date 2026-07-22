package com.Collection;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class SecondSundayNextDay {
    public static void main(String[] args) {

        // Current date
        LocalDate today = LocalDate.now();

        // First day of next month
        LocalDate date = today.plusMonths(1).withDayOfMonth(1);

        int sundayCount = 0;

        // Find the second Sunday
        while (true) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundayCount++;
                if (sundayCount == 2) {
                    break;
                }
            }
            date = date.plusDays(1);
        }

        System.out.println("Second Sunday of Next Month: " + date);
    }
}