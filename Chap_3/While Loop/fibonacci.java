package whileloop;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 
		    System.out.print("Enter the number ");
	        int n = sc.nextInt();

	        int a = 0, b = 1;
	        int i = 1;

	        while (i <= n) {
	            System.out.println(a + " ");
	            int c = a + b;
	            a = b;
	            b = c;
	            i++;
	        }

	        sc.close();
	}

}
