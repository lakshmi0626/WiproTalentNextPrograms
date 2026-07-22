package com.Collection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromeWords {

    public static void main(String[] args) {

        // Create ArrayList with 10 words
        ArrayList<String> words = new ArrayList<>();

        words.add("madam");
        words.add("java");
        words.add("level");
        words.add("apple");
        words.add("radar");
        words.add("hello");
        words.add("racecar");
        words.add("world");
        words.add("noon");
        words.add("computer");

        // Predicate to check palindrome
        Predicate<String> isPalindrome = word -> {
            String reverse = new StringBuilder(word).reverse().toString();
            return word.equalsIgnoreCase(reverse);
        };

        // Display palindrome words
        System.out.println("Palindrome Words:");

        for (String word : words) {
            if (isPalindrome.test(word)) {
                System.out.println(word);
            }
        }
    }
}