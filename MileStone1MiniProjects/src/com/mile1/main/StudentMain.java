package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentService;

public class StudentMain {

    static Student data[] = new Student[4];

    public StudentMain() {

        for (int i = 0; i < data.length; i++) {
            data[i] = new Student();
        }

        // Initialize Objects
        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {

        StudentMain obj = new StudentMain();

        StudentService service = new StudentService();

        System.out.println("******** Grade Calculation ********");

        for (Student s : data) {

            try {

                String result = service.validate(s);

                if (result.equals("VALID")) {

                    String grade = service.findGrades(s);

                    System.out.println(s.getName() + " Grade : " + grade);
                }

            } catch (NullNameException e) {
                System.out.println(e);
            }

            catch (NullStudentObjectException e) {
                System.out.println(e);
            }

            catch (NullMarksArrayException e) {
                System.out.println(e);
            
            }

        }

        System.out.println();

        System.out.println("Objects with Null Marks Array : "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Objects with Null Name : "
                + service.findNumberOfNullName(data));

        System.out.println("Null Objects : "
                + service.findNumberOfNullObjects(data));

    }
}