package Chap_3;
import java.util.Scanner;

public class countnumbersEO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int n= sc.nextInt();
		int countO =0, countE=0;
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i + " is Even");
				countO ++;
			}
			else {
				System.out.println(i + " is Odd");
				countE ++;
								
			}							
					}
		System.out.println("The Count of Even is " + countE);
		System.out.println("The Count of Odd is " + countO);
		
		sc.close();

	}

}
