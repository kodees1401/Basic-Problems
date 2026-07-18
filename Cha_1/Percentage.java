package Cha_1;
import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner Sp = new Scanner(System.in);
		
		System.out.print("Enter the Obtained value and Total value ");

		double obtainedvalue = Sp.nextDouble();
		double totalvalue = Sp.nextDouble();

		double percentage = (obtainedvalue / totalvalue) * 100;

		System.out.println("Percentage = " + percentage + " %");
		
		Sp.close();
		

	}

}
