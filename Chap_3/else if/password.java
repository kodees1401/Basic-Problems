package Chap_3;
import java.util.Scanner;

public class password {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter your password: ");
			String correct=sc.nextLine();
			
			String check= "Kodees@41";
			
			if(correct.equals(check)) 	{
				System.out.println("The password is correct.");
			}
			else {
				System.out.println("Your passowrd is incorrect please Check your password");
			}

			sc.close();
	}

}
