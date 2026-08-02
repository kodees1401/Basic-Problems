package class_program; // To print Car Class — brand, model, price (Two Objects)
import java.util.Scanner;

class Car {
    String brand;
    String model;
    double price;
 
    void show() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        Car c1 = new Car();
        System.out.print("Enter brand of car 1: ");
        c1.brand = sc.nextLine();
        System.out.print("Enter model of car 1: ");
        c1.model = sc.nextLine();
        System.out.print("Enter price of car 1: ");
        c1.price = sc.nextDouble();
        sc.nextLine(); // clear buffer
 
        Car c2 = new Car();
        System.out.print("Enter brand of car 2: ");
        c2.brand = sc.nextLine();
        System.out.print("Enter model of car 2: ");
        c2.model = sc.nextLine();
        System.out.print("Enter price of car 2: ");
        c2.price = sc.nextDouble();
 
        c1.show();
        c2.show();

        sc.close();

	}

}
