package Cha_1;
import java.util.Scanner;

public class gstbill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Bill Amount");
		double billAmount = sc.nextDouble();
		System.out.println("Enter the GST Percentage");
		double gstPercentage = sc.nextDouble();

		double gst = (billAmount * gstPercentage) / 100;
		double totalAmount = billAmount + gst;

		System.out.println("GST = " + gst);
		System.out.println("Total Amount = " + totalAmount);

		sc.close();
	}

}
