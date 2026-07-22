package com.Collection;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ReverseWordsConsumer {

    public static void main(String[] args) {

        // Create ArrayList with 10 words
        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Python");
        words.add("Apple");
        words.add("Orange");
        words.add("Computer");
        words.add("Laptop");
        words.add("Mobile");
        words.add("Keyboard");
        words.add("Mouse");
        words.add("Monitor");

        // Consumer to reverse each word and update the ArrayList
        Consumer<ArrayList<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                String reversed = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, reversed);
            }
        };

        // Apply Consumer
        reverseWords.accept(words);

        // Display updated ArrayList
        System.out.println("Reversed Words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
