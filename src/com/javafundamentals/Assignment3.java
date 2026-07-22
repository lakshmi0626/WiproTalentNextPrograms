package com.javafundamentals;
public class Assignment3 {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please enter two integers");
        } else {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            System.out.println(num1 + num2);
        }
    }
}