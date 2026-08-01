package classic_General; // Armstrong Number
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
 
     // Step 1: Count the number of digits
        int temp = num;
        int digitCount = 0;
        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp != 0) {
                digitCount++;
                temp = temp / 10;
            }
        }

        // Step 2: Sum each digit raised to the power of digitCount
        int sum = 0;
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;

            // manual power calculation: digit ^ digitCount
            int power = 1;
            for (int i = 1; i <= digitCount; i++) {
                power = power * digit;
            }

            sum += power;
            temp = temp / 10;
        }

 
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }


        sc.close();
	}

}
