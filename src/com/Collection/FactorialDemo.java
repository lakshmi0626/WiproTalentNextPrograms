package com.Collection;

//Functional Interface
@FunctionalInterface
interface Factorial {
 int factorial(int n);
}

//Class with Instance Method
class MathOperations {
 public int factorial(int n) {
     int fact = 1;
     for (int i = 1; i <= n; i++) {
         fact *= i;
     }
     return fact;
 }
}

//Main Class
public class FactorialDemo {
 public static void main(String[] args) {

     // Create object of MathOperations
     MathOperations obj = new MathOperations();

     // Reference instance method using custom functional interface
     Factorial f = obj::factorial;

     // Invoke the method
     int result = f.factorial(5);

     // Print the result
     System.out.println("Factorial = " + result);
 }
}