package com.Collection;
import java.util.ArrayList;

class Employees{
    int id;
    String name;
    String location;
    double salary;

    // Parameterized Constructor
    Employees(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    // Function to display employee details
    void display() {
        System.out.println("ID       : " + id);
        System.out.println("Name     : " + name);
        System.out.println("Location : " + location);
        System.out.println("Salary   : " + salary);
        System.out.println("---------------------------");
    }
}

public class EmployeeArrayList {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Employees> list = new ArrayList<>();

        // Add 5 Employee Objects
        list.add(new Employees(101, "Rahul", "Hyderabad", 50000));
        list.add(new Employees(102, "Priya", "Bangalore", 55000));
        list.add(new Employees(103, "Kiran", "Chennai", 60000));
        list.add(new Employees(104, "Anjali", "Pune", 65000));
        list.add(new Employees(105, "Ravi", "Mumbai", 70000));

        // Display Employee Details using function
        for (Employees emp : list) {
            emp.display();
        }
    }
}