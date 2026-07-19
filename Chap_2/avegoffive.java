package Chap_2;
import java.util.Scanner;

public class avegoffive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter 5 numbers one by one:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double n5 = sc.nextDouble();
 
        double average = (n1 + n2 + n3 + n4 + n5) / 5;
        System.out.println("Average: " + average);

        sc.close();

	}

}
