package Chap_3;
import java.util.Scanner;

public class posorneg {

	public static void main(String[] args) {
        Scanner Pn = new Scanner(System.in);
		
		System.out.println("Enter the Numbers ");
		int a=Pn.nextInt();
				
		if( a > 0  ) {
			System.out.println(" The Given Number is Positive");
			}
		else {
			System.out.println(" The Given Number is Negative");
		}
		Pn.close();

	}

}
