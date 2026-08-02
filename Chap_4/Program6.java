package class_program; // To Print Book Class — title, author, price
import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;
 
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Book b1 = new Book();
 
        System.out.print("Enter book title: ");
        b1.title = sc.nextLine();
        System.out.print("Enter author name: ");
        b1.author = sc.nextLine();
        System.out.print("Enter price: ");
        b1.price = sc.nextDouble();
 
        b1.displayDetails();

        sc.close();

	}

}
