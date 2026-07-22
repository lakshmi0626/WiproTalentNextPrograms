package com.Collection;

import java.util.LinkedList;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    void GetEmployeeDetails() {
        System.out.println(empId + " " + empName + " " + email + " " + gender + " " + salary);
    }
}

class EmployeeDB {

    LinkedList<Employee> list = new LinkedList<>();

    boolean addEmployee(Employee e) {
        return list.add(e);
    }

    boolean deleteEmployee(int empId) {

        for (Employee e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    String showPaySlip(int empId) {

        for (Employee e : list) {
            if (e.empId == empId) {
                return "Salary = " + e.salary;
            }
        }

        return "Employee not found";
    }
}

public class EmployeeLinkedList {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "Lakshmi", "lakshmi@gmail.com", "Female", 50000);

        db.addEmployee(e1);

        e1.GetEmployeeDetails();

        System.out.println(db.showPaySlip(101));
    }
}