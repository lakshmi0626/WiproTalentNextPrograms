package com.Collection;
import java.util.ArrayList;

class Student {
    private int rollNo;
    private String name;
    private int marks;

    // Parameterized Constructor
    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Getter
    public int getMarks() {
        return marks;
    }
}

public class StudentCount {
    public static void main(String[] args) {

        // 1. Add five students into an ArrayList
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Rahul", 75));
        students.add(new Student(102, "Anjali", 45));
        students.add(new Student(103, "Kiran", 68));
        students.add(new Student(104, "Sneha", 50));
        students.add(new Student(105, "Amit", 35));

        // 2. Filter students who scored minimum 50 marks
        long count = students.stream()
                             .filter(s -> s.getMarks() >= 50)
                             .count();

        // 3. Print the count
        System.out.println("Number of students who cleared the test: " + count);
    }
}
