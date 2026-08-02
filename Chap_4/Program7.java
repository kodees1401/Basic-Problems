package class_program; // To print Circle Class — calculateArea()
import java.util.Scanner;

class Circle {
    double radius;
 
    double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

public class Program7 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
 
        System.out.print("Enter radius: ");
        c1.radius = sc.nextDouble();
 
        System.out.println("Area of Circle: " + c1.calculateArea());

        sc.close();

	}

}
