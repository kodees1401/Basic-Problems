package Chap_3;
import java.util.Scanner;

public class countdown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int a=sc.nextInt();
		
		for(int i=a;i>=1; i--) {
			System.out.println( i );
		}
		
		sc.close();


	}

}
