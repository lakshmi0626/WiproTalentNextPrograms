package com.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        // Create HashMap with Generics
        HashMap<String, Integer> contacts = new HashMap<>();

        // Add contacts
        contacts.put("Rahul", 987654321);
        contacts.put("Anjali", 912345678);
        contacts.put("Kiran", 998877665);
        contacts.put("Sneha", 987123456);
        contacts.put("Amit", 901234567);

        // a) Check if a particular key exists
        String key = "Kiran";
        if (contacts.containsKey(key)) {
            System.out.println("Key '" + key + "' exists.");
        } else {
            System.out.println("Key '" + key + "' does not exist.");
        }

        // b) Check if a particular value exists
        Integer value = 987123456;
        if (contacts.containsValue(value)) {
            System.out.println("Value '" + value + "' exists.");
        } else {
            System.out.println("Value '" + value + "' does not exist.");
        }

        // c) Use Iterator to loop through the map
        System.out.println("\nContact List:");

        Iterator<Map.Entry<String, Integer>> it = contacts.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}