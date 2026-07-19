package Chap_2;
import java.util.Scanner;

public class sumofthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
 
        int sum = a + b + c;
        System.out.println("Sum of three numbers: " + sum);

        sc.close();

	}

}
