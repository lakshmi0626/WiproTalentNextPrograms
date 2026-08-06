package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentService {

    // Calculate Grade
    public String findGrades(Student studentObject) {

        int[] marks = studentObject.getMarks();

        for (int mark : marks) {
            if (mark < 35) {
                studentObject.setGrade("F");
                return "F";
            }
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        String grade;

        if (sum < 150)
            grade = "C";
        else if (sum < 200)
            grade = "B";
        else if (sum < 250)
            grade = "A";
        else
            grade = "A+";

        studentObject.setGrade(grade);

        return grade;
    }

    // Validate Student Object
    public String validate(Student student)
            throws NullNameException,
            NullMarksArrayException,
            NullStudentObjectException {

        if (student == null) {
            throw new NullStudentObjectException();
        }

        if (student.getName() == null) {
            throw new NullNameException();
        }

        if (student.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        return "VALID";
    }

    // Count Objects having Null Marks Array
    public int findNumberOfNullMarksArray(Student[] s) {

        int count = 0;

        if (s != null) {

            for (Student st : s) {

                if (st != null && st.getMarks() == null) {
                    count++;
                }
            }
        }

        return count;
    }

    // Count Objects having Null Name
    public int findNumberOfNullName(Student[] s) {

        int count = 0;

        if (s != null) {

            for (Student st : s) {

                if (st != null && st.getName() == null) {
                    count++;
                }
            }
        }

        return count;
    }

    // Count Null Student Objects
    public int findNumberOfNullObjects(Student[] s) {

        int count = 0;

        if (s != null) {

            for (Student st : s) {

                if (st == null) {
                    count++;
                }
            }
        }

        return count;
    }
}