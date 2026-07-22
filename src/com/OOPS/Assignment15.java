package com.OOPS;
import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        // Get last n characters
        String lastChars = str.substring(str.length() - n);

        String result = "";

        // Repeat last n characters n times
        for (int i = 0; i < n; i++) {
            result = result + lastChars;
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}
