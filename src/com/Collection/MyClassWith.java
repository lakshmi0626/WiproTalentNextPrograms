package com.Collection;
//Functional Interface
interface WordCount {
 int count(String str);
}

//Class with Lambda Expression
public class MyClassWith {
 public static void main(String[] args) {

     // Implementing count() using Lambda Expression
     WordCount wc = (str) -> {
         if (str == null || str.trim().isEmpty())
             return 0;

         return str.trim().split("\\s+").length;
     };

     // Input String
     String sentence = "Java is a programming language";

     // Invoke the method
     int result = wc.count(sentence);

     // Display the result
     System.out.println("String: " + sentence);
     System.out.println("Number of words = " + result);
 }
}
