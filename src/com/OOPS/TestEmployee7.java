package com.OOPS;



public class TestEmployee7 {

    public static void main(String[] args) {

        Employee7 emp = new Employee7("Lakshmi", 500000, 2024, "NI12345");

        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        // Update details
        emp.setName("Thirupathamma");
        emp.setAnnualSalary(600000);
        emp.setYearStarted(2025);
        emp.setNationalInsuranceNumber("NI67890");

        System.out.println("\nUpdated Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());
    }
}