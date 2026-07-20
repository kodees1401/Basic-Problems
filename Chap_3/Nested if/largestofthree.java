package Chap_3nestedif;
import java.util.Scanner;

public class largestofthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the Three numbers one by one ");
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("The Largest is " + a);
            }
            else {
                System.out.println("The Largest is " + c);
            }
        } 
        else {
            if (b > c) {
            	System.out.println("The Largest is " + b);
            }
            else {
                System.out.println("The Largest is " + c);
            }
        }

        sc.close();
	}

}
