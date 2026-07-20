package Chap_3;
import java.util.Scanner;

public class sumodd {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int n= sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i + " is Odd");
				sum+=i;
								
			}
		}

		System.out.println("The Sum of the  Odd numbers are " + sum);
		
		sc.close();
	}

}
