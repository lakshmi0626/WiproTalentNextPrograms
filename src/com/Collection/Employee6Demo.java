package com.Collection;

import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

class Employee6 {
    int empId;
    String empName;
    double salary;

    Employee6(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public String toString() {
        return "Employee ID : " + empId +
               ", Name : " + empName +
               ", Salary : " + salary;
    }
}

public class Employee6Demo {
    public static void main(String[] args) {

        // Create Vector to store Employee6 objects
        Vector<Employee6> employees = new Vector<>();

        // Add Employee6 objects
        employees.add(new Employee6(101, "Lakshmi", 35000));
        employees.add(new Employee6(102, "Rahul", 42000));
        employees.add(new Employee6(103, "Anjali", 50000));

        // Display using Iterator
        System.out.println("Employees using Iterator:");
        Iterator<Employee6> it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Display using Enumeration
        System.out.println("\nEmployees using Enumeration:");
        Enumeration<Employee6> en = employees.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}