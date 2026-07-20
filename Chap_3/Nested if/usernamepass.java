package Chap_3nestedif;
import java.util.Scanner;

public class usernamepass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Username");
		String username = sc.next();
		System.out.print("Enter the Password");
        String password = sc.next();

        if (username.equals("Kodees")) {
            if (password.equals("Kodees@41")) {
                System.out.println("Login Successful");
            }
            else {
                System.out.println("Incorrect Password");
            }
        } 
        else {
            System.out.println("Invalid Username");
        }
        
        sc.close();

	}

}
