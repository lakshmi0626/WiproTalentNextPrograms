package com.project5;
import java.io.Serializable;

public class Employee implements Serializable {

    private int empId;
    private String empName;
    private int age;
    private String designation;
    private double salary;

    public Employee() {
    }

    public Employee(int empId, String empName, int age, String designation, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public String toString() {
        return empId + " " + empName + " " + age + " " + designation + " " + salary;
    }
}