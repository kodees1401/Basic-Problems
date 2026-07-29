package do_while; // Reverse a Number using Do While Loop
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the NUmber ");
        int n = sc.nextInt();
        int reverse = 0;

        do {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        } while (n > 0);

        System.out.println("Reverse = " + reverse);

        sc.close();

	}

}
