package Chap_3elifla;
import java.util.Scanner;

public class gradeSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Mark");
		int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Your Grade is A");
        }
        else if (marks >= 80) {
            System.out.println("Your Grade is  B");
        }
        else if (marks >= 70) {
            System.out.println("Your Grade is  C");
        }
        else if (marks >= 60) {
            System.out.println("Your Grade is  D");
        }
        else {
            System.out.println("Your Grade is  F");
        }

        sc.close();
	}

}
