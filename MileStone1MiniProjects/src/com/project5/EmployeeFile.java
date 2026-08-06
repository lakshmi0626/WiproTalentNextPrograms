package com.project5;
import java.io.*;
import java.util.*;

public class EmployeeFile {

    private static final String FILE_NAME = "employee.dat";

    public void addEmployee(Employee emp) {

        ArrayList<Employee> list = readEmployees();
        list.add(emp);

        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(FILE_NAME));

            oos.writeObject(list);
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Employee> readEmployees() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return new ArrayList<Employee>();
        }

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(FILE_NAME));

            ArrayList<Employee> list =
                    (ArrayList<Employee>) ois.readObject();

            ois.close();

            return list;

        } catch (Exception e) {
            return new ArrayList<Employee>();
        }
    }

    public void displayEmployees() {

        ArrayList<Employee> list = readEmployees();

        System.out.println("-----Report-----");

        for (Employee e : list) {
            System.out.println(e);
        }

        System.out.println("-----End of Report-----");
    }

}