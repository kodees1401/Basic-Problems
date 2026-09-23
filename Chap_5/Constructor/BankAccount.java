package Constructor;

import java.util.Scanner;

class BankAccount {

    String accountNumber;
    String holderName;
    double balance;

    // Parameterized Constructor
    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Copy Constructor
    BankAccount(BankAccount b) {
        accountNumber = b.accountNumber;
        holderName = b.holderName;
        balance = b.balance;
    }

    void display() {
        System.out.println("\n----- Bank Account Details -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : Rs." + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String holderName = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        // Creating first object
        BankAccount b1 =
            new BankAccount(accountNumber, holderName, balance);

        System.out.println("\nOriginal Account:");
        b1.display();

        
        sc.close();
    }
}
