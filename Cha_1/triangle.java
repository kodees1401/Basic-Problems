package Cha_1;
import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Three Sides");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

        boolean check = (( a+b>c && a+c>b && b+c>a));
		
		System.out.println(check);
    
		sc.close();
	}

}
