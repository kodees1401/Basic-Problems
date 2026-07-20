package Chap_3;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner At = new Scanner(System.in);
		
		System.out.println("Enter the Temperature in F' ");
		float temp=At.nextFloat();
		
		if(temp > 97 && temp < 100) {
			System.out.println("The Temperature is Normal");
		}
        System.out.println("Executer sucessfully");
        
        At.close();
	}

}
