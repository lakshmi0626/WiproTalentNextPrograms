package com.OOPS;
import java.util.StringJoiner;

public class Assignment17 {
    public static void main(String[] args) {

        StringJoiner s1 = new StringJoiner("-");
        s1.add("Hyderabad");
        s1.add("Chennai");
        s1.add("Bangalore");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Delhi");
        s2.add("Mumbai");
        s2.add("Pune");

        // s1 merged to s2
        StringJoiner result1 = new StringJoiner("-");
        result1.setEmptyValue("");
        result1.add("Delhi");
        result1.add("Mumbai");
        result1.add("Pune");
        result1.merge(s1);

        System.out.println("s1 merged to s2:");
        System.out.println(result1);

        // s2 merged to s1
        StringJoiner result2 = new StringJoiner("-");
        result2.add("Hyderabad");
        result2.add("Chennai");
        result2.add("Bangalore");
        result2.merge(s2);

        System.out.println("s2 merged to s1:");
        System.out.println(result2);
    }
}