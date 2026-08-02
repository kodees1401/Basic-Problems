package class_program; // To Print Calculator Class — Addition, Subtraction, Multiplication, Division
import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
    double divide(int a, int b) {
        return (double) a / b;
    }
}

public class Problem11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
 
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
 
        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));

        sc.close();

	}

}
