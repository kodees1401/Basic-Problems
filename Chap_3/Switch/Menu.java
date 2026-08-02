package switch_problems; // To write for Menu-Based Program (Restaurant Order)
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("----- Welcome to Java Cafe -----");
        System.out.println("1. Coffee - Rs.50");
        System.out.println("2. Tea - Rs.30");
        System.out.println("3. Sandwich - Rs.80");
        System.out.println("4. Burger - Rs.100");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();
 
        switch (choice) {
            case 1:
                System.out.println("You ordered Coffee - Rs.50");
                break;
            case 2:
                System.out.println("You ordered Tea - Rs.30");
                break;
            case 3:
                System.out.println("You ordered Sandwich - Rs.80");
                break;
            case 4:
                System.out.println("You ordered Burger - Rs.100");
                break;
            case 5:
                System.out.println("Thank you! Visit again!");
                break;
            default:
                System.out.println("Invalid choice! Please select 1-5.");
        }

        sc.close();

	}

}
