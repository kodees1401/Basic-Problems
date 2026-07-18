package Cha_1;
import java.util.Scanner;

public class kelvin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Degree in Celsius");
		double celsius = sc.nextDouble();

		double kelvin = celsius + 273.15;

		System.out.println(" The Kelvin is " + kelvin);
		
		sc.close();

	}

}
