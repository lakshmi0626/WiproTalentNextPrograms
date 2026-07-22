package com.WrapperClass;
class Employee implements Cloneable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Clone method
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    // Display method
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Original object
        Employee emp1 = new Employee(101, "Lakshmi", 50000);

        // Clone object
        Employee emp2 = emp1.clone();

        // Modify original object
        emp1.id = 102;
        emp1.name = "Priya";
        emp1.salary = 60000;

        // Display original object
        System.out.println("Original Employee:");
        emp1.display();

        // Display cloned object
        System.out.println("\nCloned Employee:");
        emp2.display();
    }
}