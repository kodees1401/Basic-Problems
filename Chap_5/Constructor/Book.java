package Constructor;

import java.util.Scanner;

class Book {

    String title;
    String author;

    // Parameterized Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Copy Constructor
    Book(Book b) {
        title = b.title;
        author = b.author;
    }

    void display() {
        System.out.println("\n----- Book Details -----");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        // Creating first object using Parameterized Constructor
        Book b1 = new Book(title, author);

        System.out.println("\nOriginal Book:");
        b1.display();

        
        sc.close();
    }
}