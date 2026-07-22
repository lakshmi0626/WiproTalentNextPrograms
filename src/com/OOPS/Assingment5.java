package com.OOPS;

public class Assingment5 {

    // Base class Fruit
    static class Fruit {

        String name;
        String taste;
        String size;

        Fruit(String name, String taste, String size) {
            this.name = name;
            this.taste = taste;
            this.size = size;
        }

        void eat() {
            System.out.println(name + " tastes " + taste);
        }
    }


    // Child class Apple
    static class Apple extends Fruit {

        Apple(String name, String taste, String size) {
            super(name, taste, size);
        }

        // Overriding eat method
        void eat() {
            System.out.println(name + " tastes sweet and juicy");
        }
    }


    // Child class Orange
    static class Orange extends Fruit {

        Orange(String name, String taste, String size) {
            super(name, taste, size);
        }

        // Overriding eat method
        void eat() {
            System.out.println(name + " tastes sweet and sour");
        }
    }


    public static void main(String[] args) {

        // Creating Fruit object
        Fruit f = new Fruit("Fruit", "different", "medium");
        f.eat();

        // Creating Apple object
        Apple a = new Apple("Apple", "sweet", "medium");
        a.eat();

        // Creating Orange object
        Orange o = new Orange("Orange", "sour", "small");
        o.eat();
    }
}