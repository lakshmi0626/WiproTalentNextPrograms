package com.project6;

import java.util.ArrayList;
import java.util.Scanner;

public class StringListOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        int choice;

        do {

            System.out.println("\n1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter the item to be inserted: ");
                    String item = sc.nextLine();

                    list.add(item);

                    System.out.println("Inserted successfully");
                    break;

                case 2:

                    System.out.print("Enter the item to be searched: ");
                    String search = sc.nextLine();

                    if (list.contains(search)) {
                        System.out.println(search + " is present in the list.");
                    } else {
                        System.out.println(search + " is not present in the list.");
                    }

                    break;

                case 3:

                    System.out.print("Enter the item to be deleted: ");
                    String delete = sc.nextLine();

                    if (list.remove(delete)) {
                        System.out.println("Deleted successfully");
                    } else {
                        System.out.println("Item not found");
                    }

                    break;

                case 4:

                    if (list.isEmpty()) {
                        System.out.println("List is Empty");
                    } else {
                        System.out.println("Items in the List:");
                        for (String s : list) {
                            System.out.println(s);
                        }
                    }

                    break;

                case 5:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}