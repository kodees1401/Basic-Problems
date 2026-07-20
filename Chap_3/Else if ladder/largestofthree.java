package Chap_3elifla;
import java.util.Scanner;

public class largestofthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Three Numbers one by one");
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
        	System.out.println("The Largest of Three number is  " + a);
        }
        else if (b > c) {
            System.out.println("The Largest of Three number is " + b);
        }
        else {
            System.out.println("The Largest of Three number is" + c);
        }
        
        sc.close();

	}

}
