package whileloop;
import java.util.Scanner;

public class tablemultiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number ");
		int n=sc.nextInt();
		
		int i=1;
		while(i<=10) {
			System.out.println(i + " x " + n + " = " + i*n );
			i++;
		}
		sc.close();

	}

}
