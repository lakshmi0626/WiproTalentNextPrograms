package com.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NegativeEvenNumbers {
    public static void main(String[] args) {

        // Create an ArrayList with numbers
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(10, -2, -5, -8, 7, 12, -14, 15, -20, 9));

        // Filter negative even numbers and store in a new ArrayList
        List<Integer> negativeEvenList = list.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        // Print the new ArrayList
        System.out.println("Original ArrayList: " + list);
        System.out.println("Negative Even Numbers: " + negativeEvenList);
    }
}