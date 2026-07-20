package Chap_3;
import java.util.Scanner;

public class squareofnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int a=sc.nextInt();
		
		for(int i=1;i<=a; i++) {
			System.out.println("The Square for given number  " + i +"  is " + i*i);
		}

		sc.close();
	}

}
