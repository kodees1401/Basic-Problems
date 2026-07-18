package Cha_1;
import java.util.Scanner;

public class totalaverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Four Subject Marks");
		int subject1 = sc.nextInt();
		int subject2 = sc.nextInt();
		int subject3 = sc.nextInt();
		int subject4 = sc.nextInt();

		int total = subject1 + subject2 + subject3 + subject4;
		double average = total / 4.0;

		System.out.println("Total = " + total);
		System.out.println("Average = " + average);

		sc.close();
	}

}
