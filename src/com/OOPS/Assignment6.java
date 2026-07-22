package com.OOPS;

public class Assignment6 {

    // Parent class
    static class Shape {

        void draw() {
            System.out.println("Drawing Shape");
        }

        void erase() {
            System.out.println("Erasing Shape");
        }
    }


    // Child class Circle
    static class Circle extends Shape {

        void draw() {
            System.out.println("Drawing Circle");
        }

        void erase() {
            System.out.println("Erasing Circle");
        }
    }


    // Child class Triangle
    static class Triangle extends Shape {

        void draw() {
            System.out.println("Drawing Triangle");
        }

        void erase() {
            System.out.println("Erasing Triangle");
        }
    }


    // Child class Square
    static class Square extends Shape {

        void draw() {
            System.out.println("Drawing Square");
        }

        void erase() {
            System.out.println("Erasing Square");
        }
    }


    public static void main(String[] args) {

        // Polymorphism
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        c.draw();
        c.erase();

        t.draw();
        t.erase();

        s.draw();
        s.erase();
    }
}