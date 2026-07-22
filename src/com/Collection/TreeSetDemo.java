package com.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Java");
        ts.add("Python");
        ts.add("Oracle");
        ts.add("Spring");
        ts.add("HTML");

        // a) Reverse Order
        System.out.println("Reverse Order:");
        for (String s : ts.descendingSet()) {
            System.out.println(s);
        }

        // b) Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> it = ts.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // c) Check element
        if (ts.contains("Java"))
            System.out.println("\nJava exists.");
        else
            System.out.println("\nJava does not exist.");
    }
}