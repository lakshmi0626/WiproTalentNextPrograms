package com.project6;



import java.util.*;

class Box implements Comparable<Box> {
    private Double length;
    private Double width;
    private Double height;

    public Box() {
    }

    public Box(Double length, Double width, Double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    // Calculate volume: length * width * height
    public Double getVolume() {
        return this.length * this.width * this.height;
    }

    // Boxes are equal if their volumes are equal (rounded to 2 decimal places to match precision)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Box box = (Box) obj;
        return Math.abs(this.getVolume() - box.getVolume()) < 0.001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Math.round(getVolume() * 100.0) / 100.0);
    }

    // Allows sorting by volume ascending to match output format
    @Override
    public int compareTo(Box o) {
        return Double.compare(this.getVolume(), o.getVolume());
    }
}

public class Boxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TreeSet keeps elements unique and sorted by volume
        Set<Box> boxSet = new TreeSet<>();

        System.out.println("Enter the number of Box");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details");
            System.out.println("Enter Length");
            double length = scanner.nextDouble();
            System.out.println("Enter Width");
            double width = scanner.nextDouble();
            System.out.println("Enter Height");
            double height = scanner.nextDouble();

            Box box = new Box(length, width, height);
            boxSet.add(box);
        }

        System.out.println("Unique Boxes in the Set are");
        for (Box box : boxSet) {
            System.out.printf(Locale.US, "Length =%.1f Width =%.1f Height =%.1f Volume =%.2f\n",
                    box.getLength(), box.getWidth(), box.getHeight(), box.getVolume());
        }

        scanner.close();
    }
}

