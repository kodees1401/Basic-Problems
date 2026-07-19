package Chap_2;
import java.util.Scanner;

public class namemark {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();
 
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);

        sc.close();

	}

}
