package com.mile2.service;



import com.mile2.bean.Student;
import com.mile2.exception.NullMarksArrayException;
import com.mile2.exception.NullNameException;
import com.mile2.exception.NullStudentException;

public class StudentReport {

    public String findGrade(Student studentObject) {
        int[] marks = studentObject.getMarks();
        
        // Check if any mark is less than 35
        for (int mark : marks) {
            if (mark < 35) {
                return "F";
            }
        }

        // Calculate sum
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        // Assign grade based on total score
        if (sum <= 150) {
            return "D";
        } else if (sum <= 200) {
            return "C";
        } else if (sum <= 250) {
            return "B";
        } else {
            return "A";
        }
    }

    public String validate(Student studentObject) 
            throws NullStudentException, NullNameException, NullMarksArrayException {
        
        if (studentObject == null) {
            throw new NullStudentException();
        } else {
            if (studentObject.getName() == null) {
                throw new NullNameException();
            }
            if (studentObject.getMarks() == null) {
                throw new NullMarksArrayException();
            }
        }
        return "VALID";
    }
}