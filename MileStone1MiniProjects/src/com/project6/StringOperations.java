package com.project6;

import java.util.ArrayList;

public class StringOperations {

    public static ArrayList<String> performStringOperations(String S1, String S2) {
        ArrayList<String> resultList = new ArrayList<>();

        // Operation 1: Replace character in each alternate index (0, 2, 4, ...) of S1 with S2
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < S1.length(); i++) {
            if (i % 2 == 0) {
                op1.append(S2);
            } else {
                op1.append(S1.charAt(i));
            }
        }
        resultList.add(op1.toString());

        // Helper check to count occurrences of S2 in S1
        int occurrenceCount = countOccurrences(S1, S2);

        // Operation 2: If S2 appears more than once in S1, replace the last occurrence with reverse of S2, else return S1+S2
        if (occurrenceCount > 1) {
            int lastIndex = S1.lastIndexOf(S2);
            String reversedS2 = new StringBuilder(S2).reverse().toString();
            String op2 = S1.substring(0, lastIndex) + reversedS2 + S1.substring(lastIndex + S2.length());
            resultList.add(op2);
        } else {
            resultList.add(S1 + S2);
        }

        // Operation 3: If S2 appears more than once in S1, delete the first occurrence of S2 in S1, else return S1
        if (occurrenceCount > 1) {
            int firstIndex = S1.indexOf(S2);
            String op3 = S1.substring(0, firstIndex) + S1.substring(firstIndex + S2.length());
            resultList.add(op3);
        } else {
            resultList.add(S1);
        }

        // Operation 4: Divide S2 into two halves and add first half to beginning and second half to end of S1
        int n = S2.length();
        int splitIndex;
        if (n % 2 == 0) {
            splitIndex = n / 2;
        } else {
            splitIndex = (n / 2) + 1;
        }
        String firstHalf = S2.substring(0, splitIndex);
        String secondHalf = S2.substring(splitIndex);
        String op4 = firstHalf + S1 + secondHalf;
        resultList.add(op4);

        // Operation 5: If S1 contains characters that are present in S2, change all such characters to *
        StringBuilder op5 = new StringBuilder();
        for (int i = 0; i < S1.length(); i++) {
            char currentChar = S1.charAt(i);
            if (S2.indexOf(currentChar) != -1) {
                op5.append('*');
            } else {
                op5.append(currentChar);
            }
        }
        resultList.add(op5.toString());

        return resultList;
    }

    private static int countOccurrences(String text, String str) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(str, index)) != -1) {
            count++;
            index += str.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String S1 = "JAVAJAVA";
        String S2 = "VA";

        ArrayList<String> output = performStringOperations(S1, S2);

        System.out.println("Output:" + output);
    }
}