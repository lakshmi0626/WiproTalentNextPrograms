package com.OOPS;
public class Assignment3 {

    // Author class
    static class Author {
        String name;
        String email;
        char gender;

        // Parameterized constructor
        Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        void displayAuthor() {
            System.out.println("Author Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Gender: " + gender);
        }
    }

    // Book class
    static class Book {
        String name;
        Author author;
        double price;
        int qtyInStock;

        // Parameterized constructor
        Book(String name, Author author, double price, int qtyInStock) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.qtyInStock = qtyInStock;
        }

        void displayBook() {
            System.out.println("Book Name: " + name);
            author.displayAuthor();
            System.out.println("Price: " + price);
            System.out.println("Quantity in Stock: " + qtyInStock);
        }
    }

    public static void main(String[] args) {

        // Creating Author object
        Author a1 = new Author("James Gosling", "james@gmail.com", 'M');

        // Creating Book object
        Book b1 = new Book("Java Programming", a1, 500.0, 10);

        // Display book details
        b1.displayBook();
    }
}