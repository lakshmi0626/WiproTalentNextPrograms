package com.mile2.service;


import com.mile2.bean.Student;

public class StudentService {

    public int findNumberOfNullMarks(Student[] data) {
        int count = 0;
        if (data != null) {
            for (Student student : data) {
                if (student != null && student.getMarks() == null) {
                    count++;
                }
            }
        }
        return count;
    }

    public int findNumberOfNullName(Student[] data) {
        int count = 0;
        if (data != null) {
            for (Student student : data) {
                if (student != null && student.getName() == null) {
                    count++;
                }
            }
        }
        return count;
    }

    public int findNumberOfNullObjects(Student[] data) {
        int count = 0;
        if (data != null) {
            for (Student student : data) {
                if (student == null) {
                    count++;
                }
            }
        }
        return count;
    }
}