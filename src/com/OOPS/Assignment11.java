package com.OOPS;
import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        String result;

        if (a.length() < b.length()) {
            result = a + b + a;
        } else {
            result = b + a + b;
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}