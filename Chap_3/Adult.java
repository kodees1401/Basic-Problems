package Chap_3;
import java.util.Scanner;

public class Adult {

	public static void main(String[] args) {
		Scanner Ad = new Scanner(System.in);
		
		System.out.println("Enter the Age ");
		int age = Ad.nextInt();
		
		if(age>=18) {
			System.out.println("The Entered Person is Adult");
			
		}
        System.out.println(" Executed Successfully ");
        
        Ad.close();
	}

}
