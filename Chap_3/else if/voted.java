package Chap_3;
import java.util.Scanner;

public class voted {

	public static void main(String[] args) {
		Scanner Uv = new Scanner(System.in);
		
		System.out.println("Enter the Age of the Person");
		int age = Uv.nextInt();
		
		if(age >= 18) {
			System.out.println("The Person is Eligable to vote");
			}
		else {
			System.out.println("The Person is not Eligable to vote");
		}
		 
		Uv.close();

	}

}
