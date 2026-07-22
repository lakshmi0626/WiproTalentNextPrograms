package com.javafundamentals;
public class Assignment20 {

    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        int temp = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (temp == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}