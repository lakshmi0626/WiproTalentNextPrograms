package com.IoStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            // Enter file name
            System.out.print("Enter file name: ");
            String fileName = input.nextLine();

            // Enter character to search
            System.out.print("Enter character to count: ");
            char ch = Character.toLowerCase(input.next().charAt(0));

            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            int count = 0;

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine().toLowerCase();

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ch) {
                        count++;
                    }
                }
            }

            fileReader.close();

            System.out.println("Character '" + ch + "' occurred " + count + " times.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        input.close();
    }
}
