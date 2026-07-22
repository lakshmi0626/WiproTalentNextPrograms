package com.Collection;

import java.util.ArrayList;
import java.util.Random;

public class PrimeNumbersLambda {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        Random random = new Random();

        // Add 25 random numbers (1 to 100)
        for (int i = 0; i < 25; i++) {
            al.add(random.nextInt(100) + 1);
        }

        // Print all numbers
        System.out.println("ArrayList: " + al);

        // Print prime numbers using lambda expression
        System.out.println("Prime Numbers:");
        al.forEach(n -> {
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

            if (isPrime) {
                System.out.print(n + " ");
            }
        });
    }
}
