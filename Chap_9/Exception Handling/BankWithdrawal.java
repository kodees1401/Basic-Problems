package Execption;

import java.util.Scanner;


//=====================================================
//CUSTOM EXCEPTION - INSUFFICIENT FUNDS
//=====================================================

class InsufficientFundsException extends Exception {

 public InsufficientFundsException(String message) {
     super(message);
 }
}


//=====================================================
//BANK ACCOUNT CLASS
//=====================================================

class BankAccount {

 private String accountNumber;
 private String accountHolder;
 private double balance;


 // Constructor
 public BankAccount(String accountNumber,
                    String accountHolder,
                    double balance) {

     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }


 // Getter methods

 public String getAccountNumber() {
     return accountNumber;
 }


 public String getAccountHolder() {
     return accountHolder;
 }


 public double getBalance() {
     return balance;
 }


 // Display account details
 public void displayAccount() {

     System.out.println();
     System.out.println("Account Details");
     System.out.println("Account Number  : " + accountNumber);
     System.out.println("Account Holder  : " + accountHolder);
     System.out.println("Current Balance : ₹" + balance);
 }


 // =================================================
 // WITHDRAW METHOD
 // "throws" -> the method DECLARES the exception
 // "throw"  -> the method actually THROWS it
 // =================================================

 public void withdraw(double amount)
         throws InsufficientFundsException {

     // Amount must be greater than zero
     if (amount <= 0) {

         throw new IllegalArgumentException(
                 "Withdrawal amount must be greater than zero."
         );
     }


     // Withdrawal amount is more than the balance
     // so we throw the custom exception
     if (amount > balance) {

         throw new InsufficientFundsException(
                 "Insufficient funds! Balance is ₹"
                 + balance
                 + " but you tried to withdraw ₹"
                 + amount
         );
     }


     // Withdrawal is valid
     balance = balance - amount;

     System.out.println(
             "Withdrawal successful: ₹" + amount
     );

     System.out.println(
             "Remaining balance    : ₹" + balance
     );
 }
}


//=====================================================
//MAIN CLASS
//=====================================================

public class BankWithdrawal {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);


     System.out.println(
             "========== BANK WITHDRAWAL SYSTEM =========="
     );


     // =================================================
     // GET ACCOUNT DETAILS FROM THE USER
     // =================================================

     System.out.println();
     System.out.println("Enter your account details");


     // Account number
     System.out.print("Enter Account Number: ");
     String accountNumber = sc.nextLine();


     // Account holder name
     System.out.print("Enter Account Holder Name: ");
     String accountHolder = sc.nextLine();


     // Initial balance (repeat until a valid value is entered)
     double balance = 0;

     boolean validBalance = false;

     while (!validBalance) {

         System.out.print("Enter Initial Balance: ");

         try {

             balance = Double.parseDouble(
                     sc.nextLine()
             );


             if (balance < 0) {

                 System.out.println(
                         "Balance cannot be negative. Try again."
                 );
             }

             else {

                 validBalance = true;
             }
         }


         catch (NumberFormatException e) {

             System.out.println(
                     "Please enter a valid numeric balance."
             );
         }
     }


     // Create bank account using the entered details
     BankAccount account =
             new BankAccount(
                     accountNumber,
                     accountHolder,
                     balance
             );


     // Show account details
     account.displayAccount();


     String again = "y";


     // =================================================
     // TRANSACTION LOOP
     // =================================================

     while (again.equalsIgnoreCase("y")) {

         System.out.println();

         System.out.print(
                 "Enter amount to withdraw: "
         );


         // try -> code that may cause an exception
         try {

             double amount = Double.parseDouble(
                     sc.nextLine()
             );


             account.withdraw(amount);
         }


         // catch -> handles the custom exception
         catch (InsufficientFundsException e) {

             System.out.println(
                     "\nERROR: " + e.getMessage()
             );
         }


         // catch -> handles invalid (non-numeric) input
         catch (NumberFormatException e) {

             System.out.println(
                     "\nERROR: Please enter a valid numeric amount."
             );
         }


         // catch -> handles zero / negative amount
         catch (IllegalArgumentException e) {

             System.out.println(
                     "\nERROR: " + e.getMessage()
             );
         }


         // finally -> ALWAYS runs, whether an
         // exception occurred or not
         finally {

             System.out.println(
                     "Transaction completed. Thank you for banking with us."
             );
         }


         System.out.print(
                 "\nDo you want another transaction? (y/n): "
         );

         again = sc.nextLine();
     }


     System.out.println();
     System.out.println("Final Balance : ₹" + account.getBalance());
     System.out.println("Program ended.");


     sc.close();
 }
}