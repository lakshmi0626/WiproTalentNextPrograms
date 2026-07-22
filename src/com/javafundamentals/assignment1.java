package com.javafundamentals;
public class assignment1 {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please enter two strings");
        } else {
            System.out.println(args[0] + " Technologies " + args[1]);
        }
    }
}