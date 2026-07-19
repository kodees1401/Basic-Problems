package Chap_2;
import java.util.Scanner;

public class simpleinterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double n = sc.nextDouble();
 
        double si = (p * r * n) / 100;
        System.out.println("Simple Interest: " + si);

        sc.close();

	}

}
