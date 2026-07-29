package do_while; // Factorial of a Number using Do While Loop
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the NUmbers");
        int n = sc.nextInt();
        int i = 1;
        int fact = 1;

        do {
            fact = fact * i;
            i++;
        } while (i <= n);

        System.out.println("Factorial = " + fact);

        sc.close();

	}

}
