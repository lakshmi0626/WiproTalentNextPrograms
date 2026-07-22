package com.Collection;
import java.util.ArrayList;
import java.util.function.Consumer;

public class OddEvenConsumer {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(11);
        numbers.add(14);
        numbers.add(17);
        numbers.add(20);
        numbers.add(23);
        numbers.add(26);
        numbers.add(29);

        // Consumer to display number and whether it is odd or even
        Consumer<Integer> checkNumber = num -> {
            if (num % 2 == 0)
                System.out.println(num + " Even");
            else
                System.out.println(num + " Odd");
        };

        // Apply Consumer
        numbers.forEach(checkNumber);
    }
}