package Cha_1;
import java.util.Scanner;

public class Houtosec {

	public static void main(String[] args) {
		Scanner hc = new Scanner(System.in);
		
		System.out.println("Enter the Hour");
		int h= hc.nextInt();
		
		int s = h * 3600;
		System.out.println("The Seconds for given hour is " + s);
		hc.close();
	}

}
