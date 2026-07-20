package Chap_3;
import java.util.Scanner;

public class Greatestoftwo {

	public static void main(String[] args) {
		Scanner Gt = new Scanner(System.in);
		
		System.out.println("Enter the Two NUmbers ");
		int a=Gt.nextInt();
		int b=Gt.nextInt();
		
		if( a>b ) {
			System.out.println(" A is Greatest");
			}
		else {
			System.out.println(" B is Greatest");
		}
		Gt.close();
	}

}
