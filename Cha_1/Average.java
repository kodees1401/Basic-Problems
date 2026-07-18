package Cha_1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner Av = new Scanner(System.in);
		
		int num1, num2,num3;
		double average;
		
		System.out.println("Enter the Three Numbers");
		num1=Av.nextInt();
		num2=Av.nextInt();
		num3=Av.nextInt();
		
		average = (num1+num2+num3)/3.0;
		
		System.out.println(" The  Average for Three NUmber is " + average);
		
		Av.close();

	}

}
