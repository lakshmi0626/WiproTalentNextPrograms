package com.javafundamentals;
public class Assignment15 {

    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}