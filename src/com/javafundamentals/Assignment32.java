package com.javafundamentals;
public class Assignment32 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] c = new int[2];

        c[0] = a[1];
        c[1] = b[1];

        System.out.print("{");

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);

            if (i < c.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("}");
    }
}