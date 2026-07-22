package com.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Rahul");
        employees.add("Anjali");
        employees.add("Kiran");
        employees.add("Sneha");
        employees.add("Amit");

        Iterator<String> it = employees.iterator();

        System.out.println("Employee Names:");

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}