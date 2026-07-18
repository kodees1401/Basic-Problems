package Cha_1;
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner Sw = new Scanner(System.in);
		
		System.out.println("Enter the Two Numbers ");
 
		int a = Sw.nextInt();
		int b = Sw.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);	

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		Sw.close();

	}

}
