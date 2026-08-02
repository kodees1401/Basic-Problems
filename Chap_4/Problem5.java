package class_program; // To Print BankAccount Class — deposit() and withdraw()
import java.util.Scanner;

class BankAccount {
    double balance = 0;
 
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
 
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
 
        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);
 
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        acc.withdraw(withdrawAmount);
 
        System.out.println("Final Balance: " + acc.balance);

        sc.close();

	}

}
