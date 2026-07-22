package com.OOPS;

import java.util.Optional;

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class InvalidEmployeeException extends Exception {
    InvalidEmployeeException(String message) {
        super(message);
    }
}

public class Assignment20 {

    public static void main(String[] args) {

        Employee emp = null;

        try {
            Optional<Employee> employee = Optional.ofNullable(emp);

            employee.orElseThrow(() ->
                new InvalidEmployeeException("Employee object is null")
            );

            System.out.println("Employee is valid");

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}