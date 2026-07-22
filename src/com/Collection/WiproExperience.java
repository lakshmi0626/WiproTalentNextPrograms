package com.Collection;
import java.time.LocalDate;
import java.time.Period;

public class WiproExperience {
    public static void main(String[] args) {

        // Enter your Wipro joining date
        LocalDate joiningDate = LocalDate.of(2025, 6, 29);

        // Current date
        LocalDate today = LocalDate.now();

        // Calculate experience
        Period experience = Period.between(joiningDate, today);

        // Display experience
        System.out.println("Joining Date : " + joiningDate);
        System.out.println("Today's Date : " + today);
        System.out.println("Experience   : "
                + experience.getYears() + " Years, "
                + experience.getMonths() + " Months, "
                + experience.getDays() + " Days");
    }
}