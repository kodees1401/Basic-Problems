package Chap_2;
import java.util.Scanner;

public class PrintNAF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();     
        sc.nextLine(); // clear buffer
        System.out.print("Enter your favorite subject: ");
        String subject = sc.nextLine();
 
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favorite Subject: " + subject);


        sc.close();
	}

}
