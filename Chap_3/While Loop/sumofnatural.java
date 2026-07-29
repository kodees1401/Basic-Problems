package whileloop;
import java.util.Scanner;

public class sumofnatural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int a=sc.nextInt();
		
		int sum=0;
		int i=1;
		while(i<=a) {
			sum += i ;
			i++;
		}
		System.out.println("Sum is " + sum);

		sc.close();
	}

}
