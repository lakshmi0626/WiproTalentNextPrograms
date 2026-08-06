package com.project6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList<Employee>();

        System.out.print("Enter the Number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Employee " + i + " Details:");

            System.out.print("Enter the Firstname: ");
            String first = sc.nextLine();

            System.out.print("Enter the Lastname: ");
            String last = sc.nextLine();

            System.out.print("Enter the Mobile: ");
            long mobile = sc.nextLong();
            sc.nextLine();

            System.out.print("Enter the Email: ");
            String email = sc.nextLine();

            System.out.print("Enter the Address: ");
            String address = sc.nextLine();

            Employee emp = new Employee(first, last, mobile, email, address);

            list.add(emp);
        }

        Collections.sort(list);

        System.out.println("\nEmployee List:\n");

        System.out.printf("%-15s %-15s %-15s %-30s %-15s\n",
                "FirstName",
                "SecondName",
                "MobileNumber",
                "Email",
                "Address");

        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }
}