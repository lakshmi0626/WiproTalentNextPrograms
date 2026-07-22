package com.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {

    ArrayList<String> list = new ArrayList<>();

    void printAll() {
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {

        StringArrayList obj = new StringArrayList();

        obj.list.add("Java");
        obj.list.add("Python");
        obj.list.add("C");
        obj.list.add("C++");

        obj.printAll();
    }
}
