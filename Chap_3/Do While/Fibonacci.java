package do_while; // Fibonacci Series (First n Terms) using DO While Loop
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        int i = 1;

        do {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        } while (i <= n);

        sc.close();

	}

}
