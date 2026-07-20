package Chap_3elifla;
import java.util.Scanner;

public class studentperformance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Marks ");
		int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Your Performance is Excellent");
        }
        else if (marks >= 75) {
            System.out.println("Your Performance is Very Good");
        }
        else if (marks >= 50) {
            System.out.println("Your Performance is Good");
        }
        else {
            System.out.println("You Needs Improvement");
        }

        sc.close();
	}

}
