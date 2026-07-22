package com.Collection;

//Functional Interface
@FunctionalInterface
interface PrimeCheck {
 PrimeNumber check(int n);
}

//Class with Parameterized Constructor
class PrimeNumber {

 // Parameterized Constructor
 public PrimeNumber(int n) {
     boolean isPrime = true;

     if (n <= 1) {
         isPrime = false;
     } else {
         for (int i = 2; i <= Math.sqrt(n); i++) {
             if (n % i == 0) {
                 isPrime = false;
                 break;
             }
         }
     }

     if (isPrime)
         System.out.println(n + " is Prime");
     else
         System.out.println(n + " is Not Prime");
 }
}

//Main Class
public class ConstructorReferenceDemo {
 public static void main(String[] args) {

     // Constructor Reference
     PrimeCheck pc = PrimeNumber::new;

     // Invoke Constructor
     pc.check(17);
     pc.check(20);
 }
}