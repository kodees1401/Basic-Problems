package Chap_3nestedif;
import java.util.Scanner;

public class voterId {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the Age ");
		 int age = sc.nextInt();
		 sc.nextLine();
		 	
	     
	        if (age >= 18) {
	        	System.out.print("Please enter YES if you have voter ID.");
	    		String verify=sc.nextLine();
	    		
	            if (verify.equals("YES")) {
	                System.out.println("Eligible to Vote");
	            }
	            else {
	                System.out.println("No Voter ID");
	            } 
	        }
	        else {
	            System.out.println("Not Eligible");
	        }

	        sc.close();
	}

}
