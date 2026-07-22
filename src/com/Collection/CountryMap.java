package com.Collection;
import java.util.*;

class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    // Save Country and Capital
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // Get Capital by Country
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // Get Country by Capital
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // Create another map with Capital as Key and Country as Value
    public HashMap<String, String> createReverseMap() {
        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    // Create ArrayList of Country Names
    public ArrayList<String> getCountryList() {
        return new ArrayList<>(M1.keySet());
    }

    // Main Method
    public static void main(String[] args) {

        CountryMap obj = new CountryMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");
        obj.saveCountryCapital("Australia", "Canberra");

        System.out.println("Map M1: " + obj.M1);

        System.out.println("Capital of India: " + obj.getCapital("India"));

        System.out.println("Country of Tokyo: " + obj.getCountry("Tokyo"));

        System.out.println("Map M2: " + obj.createReverseMap());

        System.out.println("Country List: " + obj.getCountryList());
    }
}