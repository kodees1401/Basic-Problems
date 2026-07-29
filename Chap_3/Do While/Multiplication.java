package do_while; // Multiplication Table of a Given Number Using Do While loop
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		System.out.print("Enter the Number");
		 Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int i = 1;

	        do {
	            System.out.println(n + " x " + i + " = " + (n * i));
	            i++;
	        } while (i <= 10);

	        sc.close();

	}

}
