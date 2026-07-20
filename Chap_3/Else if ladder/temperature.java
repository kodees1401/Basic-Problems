package Chap_3elifla;
import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Temperature in Celsius");
		int temp = sc.nextInt();

        if (temp >= 40) {
            System.out.println("The temperature is Very Hot");
        }
        else if (temp >= 30) {
            System.out.println("The temperature is Hot"); 
        }
        else if (temp >= 20) {
            System.out.println("The temperature is Warm"); 
        }
        else {
            System.out.println("The temperature is Cold");
        }
        
        sc.close();


	}

}
