package Chap_3;
import java.util.Scanner;

public class Studentpass {

	public static void main(String[] args) {
		Scanner Sp = new Scanner(System.in);
		
		System.out.println("Enter the Mark out of 100 ");
		int mark= Sp.nextInt();
		
		if(mark>= 35) { 
			System.out.println("You are Passed");
			
		}
        System.out.println("Executer sucessfully");
        
        Sp.close();
	}

}
