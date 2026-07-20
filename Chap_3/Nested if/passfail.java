package Chap_3nestedif;
import java.util.Scanner;

public class passfail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Two Subject mark one by one");
		int m1 = sc.nextInt();
        int m2 = sc.nextInt();

        if (m1 >= 35) {
            if (m2 >= 35) {
                System.out.println("Pass on Both Subject");
            }
            else {
                System.out.println("Fail in Subject 2");
            }
        } 
        else {
            System.out.println("Fail in Subject 1");
        }

        sc.close();
	}

}
