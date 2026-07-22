package com.Collection;
import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        list.add(100);
        list.add(25.5f);
        list.add(500.75);
        list.add(200L);

        System.out.println("Numbers in ArrayList:");

        for (Number n : list) {
            System.out.println(n);
        }
    }
}