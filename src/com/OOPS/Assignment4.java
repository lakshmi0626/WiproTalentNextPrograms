package com.OOPS;
public class Assignment4 {

    // Parent class Animal
    static class Animal {

        void eat() {
            System.out.println("Animal is eating");
        }

        void sleep() {
            System.out.println("Animal is sleeping");
        }
    }

    // Child class Bird
    static class Bird extends Animal {

        // Overriding parent methods
        void eat() {
            System.out.println("Bird is eating");
        }

        void sleep() {
            System.out.println("Bird is sleeping");
        }

        // New method
        void fly() {
            System.out.println("Bird is flying");
        }
    }

    public static void main(String[] args) {

        // Creating Animal object
        Animal a = new Animal();
        a.eat();
        a.sleep();

        // Creating Bird object
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}