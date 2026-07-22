package com.OOPS;
public class Assignment1 {

    double width;
    double height;
    double depth;

    // Parameterized Constructor
    Assignment1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to return volume
    double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        // Creating object
        Assignment1 box = new Assignment1(5, 4, 3);

        System.out.println("Width = " + box.width);
        System.out.println("Height = " + box.height);
        System.out.println("Depth = " + box.depth);
        System.out.println("Volume = " + box.getVolume());
    }
}