package class_program; // To Print Laptop Class — brand, ram, price
import java.util.Scanner;

class Laptop {
    String brand;
    int ram;
    double price;
}

public class Problem8 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop l1 = new Laptop();
 
        System.out.print("Enter laptop brand: ");
        l1.brand = sc.nextLine();
        System.out.print("Enter RAM (GB): ");
        l1.ram = sc.nextInt();
        System.out.print("Enter price: ");
        l1.price = sc.nextDouble();
 
        System.out.println("Brand: " + l1.brand);
        System.out.println("RAM: " + l1.ram + " GB");
        System.out.println("Price: " + l1.price);
    
        sc.close();
	}

}
