package com.Collection;

import java.util.LinkedList;

class Employee1 {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    // Parameterized Constructor
    Employee1(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    // Display Employee Details
    void GetEmployeeDetails() {
        System.out.println("Employee1 ID : " + empId);
        System.out.println("Employee1 Name : " + empName);
        System.out.println("Email : " + email);
        System.out.println("Gender : " + gender);
        System.out.println("Salary : " + salary);
    }
}

class EmployeeDB1 {

    LinkedList<Employee1> list = new LinkedList<>();

    // Add Employee
    boolean addEmployee(Employee1 e) {
        return list.add(e);
    }

    // Delete Employee
    boolean deleteEmployee(int empId) {
        for (Employee1 e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    // Show Pay Slip
    String showPaySlip(int empId) {
        for (Employee1 e : list) {
            if (e.empId == empId) {
                return "Pay Slip\nEmployee ID : " + e.empId +
                        "\nEmployee Name : " + e.empName +
                        "\nSalary : " + e.salary;
            }
        }
        return "Employee Not Found";
    }

    // Display All Employees
    void displayEmployees() {
        for (Employee1 e : list) {
            e.GetEmployeeDetails();
            System.out.println();
        }
    }
}

public class EmployeeLinkedList1 {

    public static void main(String[] args) {

        EmployeeDB1 db = new EmployeeDB1();

        Employee1 e1 = new Employee1(101, "Lakshmi", "lakshmi@gmail.com", "Female", 50000);
        Employee1 e2 = new Employee1(102, "Ravi", "ravi@gmail.com", "Male", 45000);
        Employee1 e3 = new Employee1(103, "Priya", "priya@gmail.com", "Female", 55000);

        // Add Employees
        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);

        System.out.println("Employee Details:");
        db.displayEmployees();

        System.out.println("Pay Slip:");
        System.out.println(db.showPaySlip(102));

        System.out.println("\nDeleting Employee with ID 102...");
        db.deleteEmployee(102);

        System.out.println("\nEmployees After Deletion:");
        db.displayEmployees();
    }
}