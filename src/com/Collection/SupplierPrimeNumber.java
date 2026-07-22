package com.Collection;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierPrimeNumber {

    public static void main(String[] args) {

        // Supplier to generate first 10 prime numbers
        Supplier<ArrayList<Integer>> supplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int num = 2;

            while (primes.size() < 10) {
                boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primes.add(num);
                }

                num++;
            }

            return primes;
        };

        // Get and display the ArrayList
        ArrayList<Integer> primeList = supplier.get();
        System.out.println("First 10 Prime Numbers:");
        System.out.println(primeList);
    }
}