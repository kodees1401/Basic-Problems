package classic_General; // Prime Number
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int isPrime = 1; // 1 means "assume prime", 0 means "not prime"

	        if (num <= 1) {
	            isPrime = 0; // 0, 1, and negatives are not prime
	        } else {
	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    isPrime = 0;
	                    break; // found a divisor, no need to check further
	                }
	            }
	        }

	        if (isPrime==1) {
	            System.out.println(num + " is a Prime number");
	        } else {
	            System.out.println(num + " is not a Prime number");
	        }
	        
	        sc.close();

	}

}
