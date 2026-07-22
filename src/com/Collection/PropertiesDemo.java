package com.Collection;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

    public static void main(String[] args) {

        // Create Properties object
        Properties prop = new Properties();

        // Store states and capitals
        prop.setProperty("Andhra Pradesh", "Amaravati");
        prop.setProperty("Telangana", "Hyderabad");
        prop.setProperty("Karnataka", "Bengaluru");
        prop.setProperty("Tamil Nadu", "Chennai");
        prop.setProperty("Kerala", "Thiruvananthapuram");

        // Iterate using Iterator
        System.out.println("States and their Capitals:");

        Set<Object> keys = prop.keySet();
        Iterator<Object> it = keys.iterator();

        while (it.hasNext()) {
            String state = (String) it.next();
            String capital = prop.getProperty(state);

            System.out.println(state + " -> " + capital);
        }
    }
}