package com.IoStreams;
import java.io.*;
import java.util.Date;

class Employee1 implements Serializable {

    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // No-argument constructor
    public Employee1() {
    }

    // Parameterized constructor
    public Employee1(String name, Date dateOfBirth, String department,
                    String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeSerializtion {
    public static void main(String[] args) {

        try {
            // Create Employee object
            Employee1 emp = new Employee1(
                    "Lakshmi",
                    new Date(),
                    "IT",
                    "Software Engineer",
                    50000.0);

            // Serialization
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("data"));
            out.writeObject(emp);
            out.close();

            System.out.println("Employee object serialized successfully.");

            // Deserialization
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("data"));
            Employee1 e = (Employee1) in.readObject();
            in.close();

            System.out.println("\nEmployee Details:");
            System.out.println("Name        : " + e.getName());
            System.out.println("Date of Birth : " + e.getDateOfBirth());
            System.out.println("Department  : " + e.getDepartment());
            System.out.println("Designation : " + e.getDesignation());
            System.out.println("Salary      : " + e.getSalary());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}