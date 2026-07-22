package com.javafundamentals;
public class Assignment22 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
    }
}