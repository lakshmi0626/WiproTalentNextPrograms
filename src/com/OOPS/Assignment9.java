package com.OOPS;
import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int n = str.length();

        // Get first two characters
        String firstTwo = str.substring(0, 2);

        String result = "";

        // Repeat first two characters n times
        for (int i = 0; i < n; i++) {
            result = result + firstTwo;
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}