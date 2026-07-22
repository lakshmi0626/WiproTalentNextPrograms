package com.OOPS;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String result;

        // Check last character of first string and first character of second string
        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            result = str1 + str2.substring(1);
        } else {
            result = str1 + str2;
        }

        // Convert result to lowercase
        result = result.toLowerCase();

        System.out.println("Concatenated String: " + result);

        sc.close();
    }
}