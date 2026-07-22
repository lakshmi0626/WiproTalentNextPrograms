package com.javafundamentals;
public class Assignment27 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30};

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}