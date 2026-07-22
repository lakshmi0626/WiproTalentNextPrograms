package com.OOPS;



public class Employee7 {

    private String name;
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    // Parameterized Constructor
    public Employee7(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        this.name = name;
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}
