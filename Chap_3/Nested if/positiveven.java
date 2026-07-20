package Chap_3nestedif;
import java.util.Scanner;

public class positiveven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the NUmber");
		int n = sc.nextInt();

        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("The Number is Positive and Even");
            }
            else {
                System.out.println("The Number is Positive but not an Even Number");
            }
        }
        else {
            System.out.println("The Given Number is not Positive.");
        }
 
        sc.close();
	}

}
