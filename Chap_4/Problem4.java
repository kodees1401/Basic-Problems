package class_program; // To print Rectangle Class — Area and Perimeter
import java.util.Scanner;

class Rectangle {
    double length;
    double width;
 
    double calculateArea() {
        return length * width;
    }
 
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}
 

public class Problem4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
 
        System.out.print("Enter length: ");
        r1.length = sc.nextDouble();
        System.out.print("Enter width: ");
        r1.width = sc.nextDouble();
 
        System.out.println("Area: " + r1.calculateArea());
        System.out.println("Perimeter: " + r1.calculatePerimeter());
        
        sc.close();
    }

}
