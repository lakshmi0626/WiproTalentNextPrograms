package com.javafundamentals;

public class Assignment25 {

    public static void main(String[] args) {

        int[] arr = {10, 50, 30, 20, 40};

        // Sort the array in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Smallest Number = " + arr[0]);
        System.out.println("Second Smallest Number = " + arr[1]);

        System.out.println("Largest Number = " + arr[arr.length - 1]);
        System.out.println("Second Largest Number = " + arr[arr.length - 2]);
    }
}
