package com.OOPS;

import java.util.Scanner;

public class Assignment10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Remove first and last characters
        String result = str.substring(1, str.length() - 1);

        System.out.println("Result: " + result);

        sc.close();
    }
}