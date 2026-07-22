package com.javafundamentals;
public class Assignment8 {

    public static void main(String[] args) {

        char ch = '9';   // Change the value as needed

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabet");
        } 
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } 
        else {
            System.out.println("Special Character");
        }
    }
}