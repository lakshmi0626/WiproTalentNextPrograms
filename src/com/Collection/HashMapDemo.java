package com.Collection;
import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        // Add elements
        map.put("101", "Rahul");
        map.put("102", "Anjali");
        map.put("103", "Kiran");
        map.put("104", "Sneha");

        // a) Check if a key exists
        String key = "102";
        if (map.containsKey(key))
            System.out.println("Key " + key + " exists.");
        else
            System.out.println("Key " + key + " does not exist.");

        // b) Check if a value exists
        String value = "Sneha";
        if (map.containsValue(value))
            System.out.println("Value " + value + " exists.");
        else
            System.out.println("Value " + value + " does not exist.");

        // c) Iterate using Iterator
        System.out.println("\nHashMap Elements:");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}