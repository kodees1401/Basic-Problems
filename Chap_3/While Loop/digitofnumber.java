package whileloop;
import java.util.Scanner;

public class digitofnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the numbers");
        int n = sc.nextInt();

        while (n > 0) {
            int digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }
        sc.close();

	}

}
