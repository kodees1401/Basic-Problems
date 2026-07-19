package Chap_3;
import java.util.Scanner;

public class Positive_Number {

	public static void main(String[] args) {
		Scanner Pn = new Scanner(System.in);

		System.out.println(" Enter the Number ");
		int a= Pn.nextInt();
		
		if(a>=0) {
			System.out.println(" The Given number is Positive " + a);
		}
		
		System.out.println(" This program is Executed Sucessfully ");
		Pn.close();
	}

}
