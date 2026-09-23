package Using_this;

import java.util.Scanner;

class Book1 {

    String title;
    String author;
    double price;

    // Constructor 1
    Book1() {
        this("Unknown Book", "Unknown Author", 0);
    }

    // Constructor 2
    Book1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("\n----- Book Details -----");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : Rs." + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();

        Book1 b1 = new Book1(title, author, price);

        b1.display();

        // Calling default constructor
        Book1 b2 = new Book1();

        System.out.println("\nDefault Book:");
        b2.display();

        sc.close();
    }
}
