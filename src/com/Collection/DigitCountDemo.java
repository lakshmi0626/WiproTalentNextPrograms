package com.Collection;

//Functional Interface
@FunctionalInterface
interface DigitCounter {
 int digitCount(int n);
}

//Class with Static Method
class NumberOperations {

 public static int digitCount(int n) {
     n = Math.abs(n); // Handle negative numbers

     if (n == 0)
         return 1;

     int count = 0;
     while (n > 0) {
         count++;
         n /= 10;
     }
     return count;
 }
}

//Main Class
public class DigitCountDemo {
 public static void main(String[] args) {

     // Reference static method using custom functional interface
     DigitCounter dc = NumberOperations::digitCount;

     // Invoke the method
     int result = dc.digitCount(123456);

     // Print the result
     System.out.println("Number of digits = " + result);
 }
}