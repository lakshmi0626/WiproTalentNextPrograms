package com.Collection;
import java.util.ArrayList;

public class ArrayListSum {

    // Function to calculate sum
    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;

        for (int num : list) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 10 numbers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        // Call the function
        int total = calculateSum(numbers);

        System.out.println("ArrayList Elements: " + numbers);
        System.out.println("Sum of all elements: " + total);
    }
}