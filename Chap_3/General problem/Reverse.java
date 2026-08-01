package classic_General; // Reverse a Number and a String
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        // Reverse a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number: " + reversed);
 
        // Reverse a String
        sc.nextLine(); // clear buffer
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }

        System.out.println("Reversed string: " + reversedStr);

        sc.close();

	}

}
