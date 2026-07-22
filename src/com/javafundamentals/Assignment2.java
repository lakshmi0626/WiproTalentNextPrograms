package com.javafundamentals;

public class Assignment2 {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Please enter a name");
        } else {
            System.out.println("Welcome " + args[0]);
        }
    }
}
