package Chap_3;
import java.util.Scanner;

public class print1to10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int a=sc.nextInt();
		
		for(int i=0;i<=a; i++) {
			System.out.println( i );
		}

		sc.close();
	}

}