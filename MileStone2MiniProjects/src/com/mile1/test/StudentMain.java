
package com.mile1.test;

import com.mile2.bean.Student;
import com.mile2.exception.NullMarksArrayException;
import com.mile2.exception.NullNameException;
import com.mile2.exception.NullStudentException;
import com.mile2.service.StudentReport;
import com.mile2.service.StudentService;

public class StudentMain {

    static Student data[] = new Student[9];

    public StudentMain() {
        // TC1: Grade A computation
        data[0] = new Student("A1", new int[]{80, 85, 90});
        
        // TC2: Grade D computation
        data[1] = new Student("D1", new int[]{40, 40, 40}); 
        
        // TC3: Grade F computation (mark < 35)
        data[2] = new Student("F1", new int[]{25, 80, 90}); 
        
        // TC4: Null Student Object
        data[3] = null; 
        
        // TC5: Null Name
        data[4] = new Student(null, new int[]{70, 80, 90}); 
        
        // TC6: Null Marks Array
        data[5] = new Student("A2", null); 
        
        // Extra test objects for counting functions
        data[6] = new Student(null, new int[]{35, 35, 35}); 
        data[7] = null; 
        data[8] = new Student("A3", null); 
    }

    public static void main(String[] args) {
        StudentMain main = new StudentMain();
        StudentReport studentReport = new StudentReport();
        StudentService studentService = new StudentService();

        System.out.println("--- TESTING TC1 to TC6 (GRADE CALCULATION & VALIDATION) ---");
        for (int i = 0; i < 6; i++) {
            try {
                String validationStatus = studentReport.validate(data[i]);
                if (validationStatus.equals("VALID")) {
                    String grade = studentReport.findGrade(data[i]);
                    data[i].setGrade(grade);
                    System.out.println("TC" + (i + 1) + " Result: Grade = " + data[i].getGrade());
                }
            } catch (NullStudentException e) {
                System.out.println("TC" + (i + 1) + " Result: " + e.toString());
            } catch (NullNameException e) {
                System.out.println("TC" + (i + 1) + " Result: " + e.toString());
            } catch (NullMarksArrayException e) {
                System.out.println("TC" + (i + 1) + " Result: " + e.toString());
            }
        }

        System.out.println("\n--- TESTING TC7 to TC9 (NULL COUNTING FUNCTIONS) ---");
        System.out.println("TC7 - Number of Null Names: " + studentService.findNumberOfNullName(data));
        System.out.println("TC8 - Number of Null Student Objects: " + studentService.findNumberOfNullObjects(data));
        System.out.println("TC9 - Number of Null Marks Arrays: " + studentService.findNumberOfNullMarks(data));
    }
}