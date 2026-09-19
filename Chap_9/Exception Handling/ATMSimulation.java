package Execption;

import java.util.Scanner;


//=====================================================
//CUSTOM EXCEPTION 1 - INVALID ACCOUNT
//=====================================================

class InvalidAccountException extends Exception {

 public InvalidAccountException(String message) {
     super(message);
 }
}


//=====================================================
//CUSTOM EXCEPTION 2 - INVALID PIN
//=====================================================

class InvalidPinException extends Exception {

 public InvalidPinException(String message) {
     super(message);
 }
}


//=====================================================
//CUSTOM EXCEPTION 3 - INSUFFICIENT BALANCE
//=====================================================

class InsufficientBalanceException extends Exception {

 public InsufficientBalanceException(String message) {
     super(message);
 }
}


//=====================================================
//CUSTOM EXCEPTION 4 - INVALID AMOUNT
//=====================================================

class InvalidAmountException extends Exception {

 public InvalidAmountException(String message) {
     super(message);
 }
}


//=====================================================
//CUSTOM EXCEPTION 5 - CARD BLOCKED
//=====================================================

class CardBlockedException extends Exception {

 public CardBlockedException(String message) {
     super(message);
 }
}


//=====================================================
//ATM INTERFACE
//=====================================================

interface ATMOperations {

 void login(String accountNumber, String pin)
         throws InvalidAccountException,
                InvalidPinException,
                CardBlockedException;

 void checkBalance();

 void withdraw(int amount)
         throws InvalidAmountException,
                InsufficientBalanceException;

 void logout();
}


//=====================================================
//ACCOUNT CLASS
//=====================================================

class Account {

 public static final double MINIMUM_BALANCE = 500;

 private String accountNumber;
 private String holderName;
 private String pin;
 private double balance;

 protected boolean loggedIn;
 protected int pinAttempts;


 // Constructor
 public Account(String accountNumber,
                String holderName,
                String pin,
                double balance) {

     this.accountNumber = accountNumber;
     this.holderName = holderName;
     this.pin = pin;
     this.balance = balance;

     this.loggedIn = false;
     this.pinAttempts = 0;
 }


 // Getter methods

 public String getAccountNumber() {
     return accountNumber;
 }


 public String getHolderName() {
     return holderName;
 }


 public String getPin() {
     return pin;
 }


 public double getBalance() {
     return balance;
 }


 // Set PIN
 public void setPin(String pin)
         throws InvalidPinException {

     if (pin == null) {

         throw new InvalidPinException(
                 "PIN cannot be null."
         );
     }


     if (!pin.matches("\\d{4}")) {

         throw new InvalidPinException(
                 "PIN must be exactly 4 digits."
         );
     }


     this.pin = pin;
 }


 // Deposit money
 public void deposit(int amount)
         throws InvalidAmountException {

     if (amount < 100 || amount % 100 != 0) {

         throw new InvalidAmountException(
                 "Deposit must be at least 100 and a multiple of 100."
         );
     }


     balance = balance + amount;
 }


 // Withdraw money
 public void withdraw(int amount)
         throws InvalidAmountException,
                InsufficientBalanceException {


     // Amount must be >= 100 and a multiple of 100
     if (amount < 100 || amount % 100 != 0) {

         throw new InvalidAmountException(
                 "Amount must be at least 100 and a multiple of 100."
         );
     }


     // Amount is more than the balance
     if (amount > balance) {

         throw new InsufficientBalanceException(
                 "Insufficient balance. Available balance: ₹"
                 + balance
         );
     }


     // Minimum balance rule
     if (balance - amount < MINIMUM_BALANCE) {

         throw new InsufficientBalanceException(
                 "Minimum balance of ₹" + MINIMUM_BALANCE
                 + " must be maintained."
         );
     }


     double newBalance = balance - amount;


     // Safety check - balance must never go negative
     if (newBalance < 0) {

         throw new ArithmeticException(
                 "Withdrawal would result in a negative balance."
         );
     }


     balance = newBalance;
 }


 // Display account details
 public void displayAccount() {

     System.out.println();
     System.out.println("Account Details");
     System.out.println("Account No  : " + accountNumber);
     System.out.println("Holder Name : " + holderName);
 }


 // Method overloading
 public void displayAccount(boolean showBalance) {

     displayAccount();

     if (showBalance) {

         System.out.println("Balance     : ₹" + balance);
     }
 }
}


//=====================================================
//SAVINGS ACCOUNT CLASS
//=====================================================

class SavingsAccount extends Account {

 private String city;


 public SavingsAccount(String accountNumber,
                       String holderName,
                       String pin,
                       double balance,
                       String city) {

     super(accountNumber, holderName, pin, balance);

     this.city = city;
 }


 public void savingsDetails() {

     System.out.println();
     System.out.println("Account Type : SAVINGS");
     System.out.println("City         : " + city);
 }
}


//=====================================================
//CURRENT ACCOUNT CLASS
//=====================================================

class CurrentAccount extends Account {

 private String businessName;


 public CurrentAccount(String accountNumber,
                       String holderName,
                       String pin,
                       double balance,
                       String businessName) {

     super(accountNumber, holderName, pin, balance);

     this.businessName = businessName;
 }


 public void currentDetails() {

     System.out.println();
     System.out.println("Account Type : CURRENT");
     System.out.println("Business     : " + businessName);
 }
}


//=====================================================
//ATM SYSTEM
//=====================================================

class ATMSystem implements ATMOperations {

 private Account[] accounts;
 private int accountCount;
 private Account currentAccount;


 // Constructor
 public ATMSystem(int size) {

     accounts = new Account[size];

     accountCount = 0;

     currentAccount = null;
 }


 // =================================================
 // ADD ACCOUNT
 // =================================================

 public void addAccount(Account account) {

     if (accountCount < accounts.length) {

         accounts[accountCount] = account;

         accountCount++;

     } else {

         System.out.println(
                 "Account storage is full."
         );
     }
 }


 // =================================================
 // FIND ACCOUNT
 // =================================================

 private Account findAccount(String accountNumber)
         throws InvalidAccountException {

     for (int i = 0; i < accountCount; i++) {

         if (accounts[i].getAccountNumber()
                 .equals(accountNumber)) {

             return accounts[i];
         }
     }


     throw new InvalidAccountException(
             "Account number does not exist."
     );
 }


 // =================================================
 // LOGIN
 // =================================================

 public void login(String accountNumber, String pin)
         throws InvalidAccountException,
                InvalidPinException,
                CardBlockedException {


     // Check null
     if (accountNumber == null || pin == null) {

         throw new NullPointerException(
                 "Account number or PIN cannot be null."
         );
     }


     // Check empty
     if (accountNumber.trim().equals("")
             || pin.trim().equals("")) {

         throw new NullPointerException(
                 "Account number or PIN cannot be empty."
         );
     }


     // Check PIN format
     if (!pin.matches("\\d{4}")) {

         throw new InvalidPinException(
                 "PIN must be exactly 4 digits."
         );
     }


     // Find account
     Account account = findAccount(accountNumber);


     // Check card blocked
     if (account.pinAttempts >= 3) {

         throw new CardBlockedException(
                 "Card is blocked after 3 wrong PIN attempts."
         );
     }


     // Check PIN
     if (!account.getPin().equals(pin)) {

         account.pinAttempts++;


         if (account.pinAttempts >= 3) {

             throw new CardBlockedException(
                     "Card blocked. Maximum PIN attempts exceeded."
             );
         }


         throw new InvalidPinException(
                 "Wrong PIN. Attempt "
                 + account.pinAttempts + " of 3."
         );
     }


     // Successful login
     account.loggedIn = true;

     account.pinAttempts = 0;

     currentAccount = account;


     System.out.println();
     System.out.println("LOGIN SUCCESSFUL");
     System.out.println(
             "Welcome " + account.getHolderName()
     );
 }


 // =================================================
 // CHECK BALANCE
 // =================================================

 public void checkBalance() {

     if (currentAccount == null) {

         System.out.println(
                 "Please login first."
         );

         return;
     }


     System.out.println();
     System.out.println(
             "Available Balance : ₹"
             + currentAccount.getBalance()
     );
 }


 // =================================================
 // WITHDRAW
 // =================================================

 public void withdraw(int amount)
         throws InvalidAmountException,
                InsufficientBalanceException {

     if (currentAccount == null) {

         System.out.println(
                 "Please login first."
         );

         return;
     }


     currentAccount.withdraw(amount);


     System.out.println();
     System.out.println(
             "Please collect your cash: ₹" + amount
     );

     System.out.println(
             "Remaining Balance : ₹"
             + currentAccount.getBalance()
     );
 }


 // =================================================
 // DEPOSIT
 // =================================================

 public void deposit(int amount)
         throws InvalidAmountException {

     if (currentAccount == null) {

         System.out.println(
                 "Please login first."
         );

         return;
     }


     currentAccount.deposit(amount);


     System.out.println();
     System.out.println(
             "Deposit successful: ₹" + amount
     );

     System.out.println(
             "Updated Balance : ₹"
             + currentAccount.getBalance()
     );
 }


 // =================================================
 // CHANGE PIN
 // =================================================

 public void changePin(String oldPin, String newPin)
         throws InvalidPinException {

     if (currentAccount == null) {

         System.out.println(
                 "Please login first."
         );

         return;
     }


     // Check old PIN
     if (!currentAccount.getPin().equals(oldPin)) {

         throw new InvalidPinException(
                 "Old PIN is incorrect."
         );
     }


     // Set new PIN
     currentAccount.setPin(newPin);


     System.out.println(
             "PIN changed successfully."
     );
 }


 // =================================================
 // ACCOUNT DETAILS
 // =================================================

 public void displayAccountDetails() {

     if (currentAccount == null) {

         System.out.println(
                 "Please login first."
         );

         return;
     }


     System.out.println();
     System.out.println("========== ACCOUNT DETAILS ==========");


     currentAccount.displayAccount(true);


     // Savings account
     if (currentAccount instanceof SavingsAccount) {

         SavingsAccount savings =
                 (SavingsAccount) currentAccount;

         savings.savingsDetails();
     }


     // Current account
     else if (currentAccount instanceof CurrentAccount) {

         CurrentAccount current =
                 (CurrentAccount) currentAccount;

         current.currentDetails();
     }
 }


 // =================================================
 // LOGOUT
 // =================================================

 public void logout() {

     if (currentAccount != null) {

         currentAccount.loggedIn = false;

         System.out.println(
                 "Logged out successfully. Please take your card."
         );

         currentAccount = null;

     } else {

         System.out.println(
                 "No user is currently logged in."
         );
     }
 }
}


//=====================================================
//MAIN CLASS
//=====================================================

public class ATMSimulation {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);


     // Create ATM system
     ATMSystem atm = new ATMSystem(20);


     // =================================================
     // DEFAULT ACCOUNT 1
     // =================================================

     SavingsAccount account1 =
             new SavingsAccount(
                     "1001",
                     "Arun",
                     "1234",
                     15000,
                     "Erode"
             );


     // =================================================
     // DEFAULT ACCOUNT 2
     // =================================================

     SavingsAccount account2 =
             new SavingsAccount(
                     "1002",
                     "Adams",
                     "4321",
                     8000,
                     "Madurai"
             );


     // =================================================
     // DEFAULT ACCOUNT 3
     // =================================================

     CurrentAccount account3 =
             new CurrentAccount(
                     "1003",
                     "Murugan",
                     "1111",
                     50000,
                     "Thangam Traders"
             );


     // Add default accounts
     // No message will be printed here

     atm.addAccount(account1);
     atm.addAccount(account2);
     atm.addAccount(account3);


     int choice = 0;


     // =================================================
     // MAIN MENU
     // =================================================

     do {

         System.out.println();

         System.out.println(
                 "========== ATM SIMULATOR =========="
         );

         System.out.println("1. Login");
         System.out.println("2. Check Balance");
         System.out.println("3. Withdraw Money");
         System.out.println("4. Deposit Money");
         System.out.println("5. Change PIN");
         System.out.println("6. Account Details");
         System.out.println("7. Logout");
         System.out.println("8. Exit");


         System.out.print(
                 "\nEnter your choice: "
         );


         try {

             choice = Integer.parseInt(
                     sc.nextLine()
             );


             // =================================================
             // 1. LOGIN
             // =================================================

             if (choice == 1) {

                 System.out.print(
                         "Enter account number: "
                 );

                 String accountNumber =
                         sc.nextLine();


                 System.out.print(
                         "Enter PIN: "
                 );

                 String pin =
                         sc.nextLine();


                 try {

                     atm.login(
                             accountNumber,
                             pin
                     );
                 }


                 catch (
                         InvalidAccountException |
                         InvalidPinException |
                         CardBlockedException e) {

                     System.out.println(
                             "\nLOGIN ERROR: "
                             + e.getMessage()
                     );
                 }


                 catch (NullPointerException e) {

                     System.out.println(
                             "\nNULL ERROR: "
                             + e.getMessage()
                     );
                 }


                 finally {

                     System.out.println(
                             "Login process completed."
                     );
                 }
             }


             // =================================================
             // 2. CHECK BALANCE
             // =================================================

             else if (choice == 2) {

                 atm.checkBalance();
             }


             // =================================================
             // 3. WITHDRAW MONEY
             // =================================================

             else if (choice == 3) {

                 System.out.print(
                         "Enter amount to withdraw: "
                 );


                 try {

                     int amount = Integer.parseInt(
                             sc.nextLine()
                     );


                     atm.withdraw(amount);
                 }


                 catch (
                         InvalidAmountException |
                         InsufficientBalanceException e) {

                     System.out.println(
                             "\nWITHDRAW ERROR: "
                             + e.getMessage()
                     );
                 }


                 catch (ArithmeticException e) {

                     System.out.println(
                             "\nARITHMETIC ERROR: "
                             + e.getMessage()
                     );
                 }


                 catch (NumberFormatException e) {

                     System.out.println(
                             "Please enter a valid numeric amount."
                     );
                 }


                 finally {

                     System.out.println(
                             "Withdrawal process completed."
                     );
                 }
             }


             // =================================================
             // 4. DEPOSIT MONEY
             // =================================================

             else if (choice == 4) {

                 System.out.print(
                         "Enter amount to deposit: "
                 );


                 try {

                     int amount = Integer.parseInt(
                             sc.nextLine()
                     );


                     atm.deposit(amount);
                 }


                 catch (InvalidAmountException e) {

                     System.out.println(
                             "\nDEPOSIT ERROR: "
                             + e.getMessage()
                     );
                 }


                 catch (NumberFormatException e) {

                     System.out.println(
                             "Please enter a valid numeric amount."
                     );
                 }


                 finally {

                     System.out.println(
                             "Deposit process completed."
                     );
                 }
             }


             // =================================================
             // 5. CHANGE PIN
             // =================================================

             else if (choice == 5) {

                 System.out.print(
                         "Enter old PIN: "
                 );

                 String oldPin =
                         sc.nextLine();


                 System.out.print(
                         "Enter new PIN: "
                 );

                 String newPin =
                         sc.nextLine();


                 try {

                     atm.changePin(
                             oldPin,
                             newPin
                     );
                 }


                 catch (InvalidPinException e) {

                     System.out.println(
                             "PIN ERROR: "
                             + e.getMessage()
                     );
                 }


                 finally {

                     System.out.println(
                             "PIN operation completed."
                     );
                 }
             }


             // =================================================
             // 6. ACCOUNT DETAILS
             // =================================================

             else if (choice == 6) {

                 atm.displayAccountDetails();
             }


             // =================================================
             // 7. LOGOUT
             // =================================================

             else if (choice == 7) {

                 atm.logout();
             }


             // =================================================
             // 8. EXIT
             // =================================================

             else if (choice == 8) {

                 System.out.println();
                 System.out.println(
                         "Thank you for using the ATM."
                 );
             }


             else {

                 System.out.println(
                         "Invalid menu choice."
                 );
             }


         }


         catch (NumberFormatException e) {

             System.out.println(
                     "Please enter a valid number."
             );
         }


     } while (choice != 8);


     sc.close();
 }
}
