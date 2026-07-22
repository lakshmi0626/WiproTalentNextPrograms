package com.Collection;

import java.util.ArrayList;

public class ReverseWordsLambda {
    public static void main(String[] args) {

        // Create ArrayList and add 10 words
        ArrayList<String> al = new ArrayList<>();

        al.add("Java");
        al.add("Python");
        al.add("Oracle");
        al.add("Spring");
        al.add("Lambda");
        al.add("Stream");
        al.add("Collection");
        al.add("ArrayList");
        al.add("Eclipse");
        al.add("Programming");

        // Print original words
        System.out.println("Original Words:");
        al.forEach(word -> System.out.println(word));

        // Print each word in reverse using lambda expression
        System.out.println("\nReversed Words:");
        al.forEach(word -> {
            String reverse = new StringBuilder(word).reverse().toString();
            System.out.println(reverse);
        });
    }
}
