package com.WrapperClass;

import java.util.Scanner;

public class BinaryRepresention {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer (1 to 255): ");
        int num = sc.nextInt();

        if (num < 1 || num > 255) {
            System.out.println("Invalid input! Please enter a number between 1 and 255.");
        } else {
            // Convert number to binary string
            String binary = Integer.toBinaryString(num);

            // Pad with leading zeros to make it 8 bits
            binary = String.format("%8s", binary).replace(' ', '0');

            System.out.println("Binary Representation: " + binary);
        }

        sc.close();
    }
}