package com.Collection;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee3 {
    private int id;
    private String name;
    private double salary;

    // Parameterized Constructor
    public Employee3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeePredicates {

    public static void main(String[] args) {

        ArrayList<Employee3> list = new ArrayList<>();

        // Add 10 Employee Objects
        list.add(new Employee3(101, "Rahul", 8000));
        list.add(new Employee3(102, "Priya", 12000));
        list.add(new Employee3(103, "Kiran", 9500));
        list.add(new Employee3(104, "Anjali", 15000));
        list.add(new Employee3(105, "Ravi", 7000));
        list.add(new Employee3(106, "Sita", 11000));
        list.add(new Employee3(107, "Arun", 9800));
        list.add(new Employee3(108, "Meena", 13000));
        list.add(new Employee3(109, "Vijay", 6000));
        list.add(new Employee3(110, "Divya", 17000));

        // Predicate to filter salary < 10000
        Predicate<Employee3> lowSalary = emp -> emp.getSalary() < 10000;

        System.out.println("Employees whose salary is less than 10000:");

        for (Employee3 emp : list) {
            if (lowSalary.test(emp)) {
                System.out.println(emp.getName());
            }
        }
    }
}