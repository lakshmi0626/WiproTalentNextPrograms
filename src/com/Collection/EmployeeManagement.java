package com.Collection;
import java.util.ArrayList;

class Employee2 {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    Employee2(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    void GetEmployeeDetails() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + empName);
        System.out.println("Email       : " + email);
        System.out.println("Gender      : " + gender);
        System.out.println("Salary      : " + salary);
    }
}

class EmployeeDB2 {
    ArrayList<Employee2> list = new ArrayList<>();

    boolean addEmployee(Employee2 e) {
        return list.add(e);
    }

    boolean deleteEmployee(int empId) {
        for (Employee2 e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    String showPaySlip(int empId) {
        for (Employee2 e : list) {
            if (e.empId == empId) {
                return "Pay Slip\nEmployee ID : " + e.empId +
                        "\nName : " + e.empName +
                        "\nSalary : " + e.salary;
            }
        }
        return "Employee not found";
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        EmployeeDB2 db = new EmployeeDB2();

        Employee2 e1 = new Employee2(101, "Lakshmi", "lakshmi@gmail.com", "Female", 50000);
        Employee2 e2 = new Employee2(102, "Ravi", "ravi@gmail.com", "Male", 45000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        e1.GetEmployeeDetails();

        System.out.println("\n" + db.showPaySlip(101));

        db.deleteEmployee(102);
    }
}