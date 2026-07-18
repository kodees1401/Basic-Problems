package Cha_1;
import java.util.Scanner;

public class areaofcircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Radius value R");
        double radius = sc.nextDouble();

        double area = 3.14159 * radius * radius;

        System.out.println("Area = " + area);
        
        sc.close();

	}

}
