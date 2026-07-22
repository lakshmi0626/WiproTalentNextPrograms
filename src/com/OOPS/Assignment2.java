package com.OOPS;
public class Assignment2 {

    // Static method for integer power
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method for double power
    static double powerDouble(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {

        // Calling powerInt method
        int result1 = powerInt(2, 3);
        System.out.println("Power of 2^3 = " + result1);

        // Calling powerDouble method
        double result2 = powerDouble(2.5, 2);
        System.out.println("Power of 2.5^2 = " + result2);
    }
}