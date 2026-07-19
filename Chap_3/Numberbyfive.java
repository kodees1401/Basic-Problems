package Chap_3;
import java.util.Scanner;

public class Numberbyfive {

	public static void main(String[] args) {
		Scanner Nf = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int a= Nf.nextInt();
		
		if(a % 5==0 ) {
			System.out.println("The given number is Divisible by 5 " );
			
		}
       System.out.println("Executed Successfully ");
        
        Nf.close();

	}

}
