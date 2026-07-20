package Chap_3elifla;
import java.util.Scanner;

public class trafficlight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Colour");
		String color = sc.next();

        if (color.equalsIgnoreCase("Red")) {
            System.out.println("Stop");
        }
        else if (color.equalsIgnoreCase("Yellow")) {
        	System.out.println("Ready");
        }
        else if (color.equalsIgnoreCase("Green")) {
            System.out.println("Go");
        }
        else {
            System.out.println("Invalid Signal");
        }
        
        sc.close();

	}

}
