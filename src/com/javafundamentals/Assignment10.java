package com.javafundamentals;
public class Assignment10 {
    public static void main(String[] args) {

        char ch = 'y';   // Initialize any alphabet

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " -> " + Character.toUpperCase(ch));
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " -> " + Character.toLowerCase(ch));
        }
    }
}