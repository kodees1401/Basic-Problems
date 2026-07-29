package whileloop;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number for factorial ");
		int n = sc.nextInt();
        int i = 1;
        int fact = 1;

        while (i <= n) {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial = " + fact);
        
        sc.close();

	}

}
