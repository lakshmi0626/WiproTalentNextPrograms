package com.OOPS;
import java.util.Scanner;

public class Assignment12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Remove first and last character if they are 'x'
        if (str.length() > 1 && str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(1, str.length() - 1);
        } 
        else if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        } 
        else if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }

        System.out.println("Result: " + str);

        sc.close();
    }
}
