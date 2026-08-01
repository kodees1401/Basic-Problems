package classic_General; // Palindrome Check (Number and String)
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        // Palindrome check - number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + (num % 10);
            num = num / 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome number");
        } else {
            System.out.println(original + " is not a palindrome number");
        }

        sc.nextLine(); // clear buffer
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Manually reverse the string
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }

        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println(str + " is a palindrome string");
        } else {
            System.out.println(str + " is not a palindrome string");
        }
        
        sc.close();

	}

}
