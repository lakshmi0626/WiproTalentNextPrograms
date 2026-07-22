package com.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee4 {
    private int id;
    private String name;
    private String location;

    // Constructor
    public Employee4(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    // Display Employee Details
    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Location=" + location + "]";
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {

        // 1. Add five employees into an ArrayList
        ArrayList<Employee4> employees = new ArrayList<>();

        employees.add(new Employee4(101, "Rahul", "Pune"));
        employees.add(new Employee4(102, "Anjali", "Hyderabad"));
        employees.add(new Employee4(103, "Kiran", "Pune"));
        employees.add(new Employee4(104, "Sneha", "Chennai"));
        employees.add(new Employee4(105, "Amit", "Pune"));

        // 2. Filter employees whose location is Pune
        List<Employee4> puneEmployees = employees.stream()
                .filter(emp -> emp.getLocation().equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        // 3. Print Pune employees
        System.out.println("Employees from Pune:");
        for (Employee4 emp : puneEmployees) {
            System.out.println(emp);
        }
    }
}