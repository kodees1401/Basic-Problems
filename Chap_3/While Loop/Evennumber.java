package whileloop;
import java.util.Scanner;
public class Evennumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the Number");
		int n=sc.nextInt();
						
		int i=2;
				
		while(i<=n) {
			System.out.println(i);
			i+=2;
		}

		sc.close();
	}

}
