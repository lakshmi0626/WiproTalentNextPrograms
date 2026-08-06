package com.project6;
public class Employee implements Comparable<Employee> {

    private String firstName;
    private String lastName;
    private long mobileNumber;
    private String email;
    private String address;

    public Employee() {

    }

    public Employee(String firstName, String lastName,
                    long mobileNumber, String email, String address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int compareTo(Employee e) {
        return this.firstName.compareToIgnoreCase(e.firstName);
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15d %-30s %-15s",
                firstName, lastName, mobileNumber, email, address);
    }
}