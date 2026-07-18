package Cha_1;
import java.util.Scanner;

public class Minutes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Minutes" );
		int totalMinutes = sc.nextInt();

		int hours = totalMinutes / 60;
		int minutes = totalMinutes % 60;

		System.out.println("Hours = " + hours);
		System.out.println("Minutes = " + minutes);
         
		sc.close();
	}

}
