package class_program; // To Print Mobile Class — brand and price via a Method (Two Objects)
import java.util.Scanner;

class Mobile {
    String brand;
    double price;
 
    void display() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }
}

public class Problem9 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Mobile m1 = new Mobile();
        System.out.print("Enter brand of mobile 1: ");
        m1.brand = sc.nextLine();
        System.out.print("Enter price of mobile 1: ");
        m1.price = sc.nextDouble();
        
        sc.nextLine(); // clear buffer
 
        Mobile m2 = new Mobile();
        System.out.print("Enter brand of mobile 2: ");
        m2.brand = sc.nextLine();
        System.out.print("Enter price of mobile 2: ");
        m2.price = sc.nextDouble();
 
        m1.display();
        m2.display();

        sc.close();

	}

}
