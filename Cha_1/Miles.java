package Cha_1;
import java.util.Scanner;

public class Miles {

	public static void main(String[] args) {
		Scanner Km = new Scanner(System.in);

		System.out.print("Enter the Kilometer ");
		
		double kilometers = Km.nextDouble();

		double miles = kilometers * 0.621371;

		System.out.println("Miles = " + miles);
		
		Km.close();

	}

}
