package Cha_1;
import java.util.Scanner;

public class squarecube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter the  number ");
		int number = sc.nextInt();

		int square = number * number;
		int cube = number * number * number;

		System.out.println("Square = " + square);
		System.out.println("Cube = " + cube);
		
		sc.close();

	}

}
