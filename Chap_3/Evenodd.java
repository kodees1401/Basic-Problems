package Chap_3;
import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		Scanner Eo = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int a = Eo.nextInt();
		
		if(a%2==0) {
			System.out.println("The given number is Even");
		}
		else {
			System.out.println("The given number is Odd");
		}
		Eo.close();

	}

}
