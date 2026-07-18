package Cha_1;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner Bm = new Scanner(System.in);

		System.out.println("Enter the Weight and Height");
		
		double weight = Bm.nextDouble();
		double height = Bm.nextDouble();

		double bmi = weight / (height * height);

		System.out.println("BMI = " + bmi);
		
        Bm.close();
	}

}
