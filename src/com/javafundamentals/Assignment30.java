package com.javafundamentals;
public class Assignment30 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] result = new int[arr.length];
        int index = 0;

        // Store even numbers first
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index++;
            }
        }

        // Store odd numbers next
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        System.out.print("{");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i < result.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("}");
    }
}
