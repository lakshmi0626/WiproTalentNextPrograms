package com.OOPS;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int index = str.indexOf('*');

        // Remove *, and characters immediately left and right of *
        if (index > 0 && index < str.length() - 1) {
            str = str.substring(0, index - 1) + str.substring(index + 2);
        }

        System.out.println("Result: " + str);

        sc.close();
    }
}
