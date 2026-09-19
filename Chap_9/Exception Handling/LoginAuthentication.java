package Execption;

import java.util.Scanner;


//=====================================================
//CUSTOM EXCEPTION 1 - INVALID USER
//=====================================================

class InvalidUserException extends Exception {

 public InvalidUserException(String message) {
     super(message);
 }
}


//=====================================================
//CUSTOM EXCEPTION 2 - INVALID PASSWORD
//=====================================================

class InvalidPasswordException extends Exception {

 public InvalidPasswordException(String message) {
     super(message);
 }
}


//=====================================================
//CUSTOM EXCEPTION 3 - WEAK PASSWORD
//=====================================================

class WeakPasswordException extends Exception {

 public WeakPasswordException(String message) {
     super(message);
 }
}


//=====================================================
//CUSTOM EXCEPTION 4 - ACCOUNT BLOCKED
//=====================================================

class AccountBlockedException extends Exception {

 public AccountBlockedException(String message) {
     super(message);
 }
}


//=====================================================
//LOGIN INTERFACE
//=====================================================

interface LoginOperations {

 void login(String username, String password)
         throws InvalidUserException,
                InvalidPasswordException,
                WeakPasswordException,
                AccountBlockedException;

 void logout();

 void displayDashboard();
}


//=====================================================
//USER CLASS
//=====================================================

class User {

 private int userId;
 private String username;
 private String password;
 private String email;

 protected boolean loggedIn;
 protected int loginAttempts;


 // Constructor
 public User(int userId,
             String username,
             String password,
             String email) {

     this.userId = userId;
     this.username = username;
     this.password = password;
     this.email = email;

     this.loggedIn = false;
     this.loginAttempts = 0;
 }


 // Getter methods

 public int getUserId() {
     return userId;
 }


 public String getUsername() {
     return username;
 }


 public String getPassword() {
     return password;
 }


 public String getEmail() {
     return email;
 }


 // Set email
 public void setEmail(String email) {
     this.email = email;
 }


 // Set password
 public void setPassword(String password)
         throws WeakPasswordException {

     if (password == null) {

         throw new WeakPasswordException(
                 "Password cannot be null."
         );
     }


     if (password.length() < 8) {

         throw new WeakPasswordException(
                 "Password must contain at least 8 characters."
         );
     }


     this.password = password;
 }


 // Display user details
 public void displayUser() {

     System.out.println();
     System.out.println("User Details");
     System.out.println("User ID  : " + userId);
     System.out.println("Username : " + username);
     System.out.println("Email    : " + email);
 }


 // Method overloading
 public void displayUser(boolean showPassword) {

     displayUser();

     if (showPassword) {

         System.out.println("Password : " + password);
     }
 }
}


//=====================================================
//ADMIN CLASS
//=====================================================

class Admin extends User {

 private String department;


 public Admin(int userId,
              String username,
              String password,
              String email,
              String department) {

     super(userId, username, password, email);

     this.department = department;
 }


 public void adminDetails() {

     System.out.println();
     System.out.println("Role       : ADMIN");
     System.out.println("Department : " + department);
 }


 public void adminAccess() {

     System.out.println();
     System.out.println("Admin Access Granted");
     System.out.println("You can manage the system.");
 }
}


//=====================================================
//CUSTOMER CLASS
//=====================================================

class Customer extends User {

 private String city;
 private double accountBalance;


 public Customer(int userId,
                 String username,
                 String password,
                 String email,
                 String city,
                 double accountBalance) {

     super(userId, username, password, email);

     this.city = city;
     this.accountBalance = accountBalance;
 }


 public void customerDetails() {

     System.out.println();
     System.out.println("Role : CUSTOMER");
     System.out.println("City : " + city);
 }


 public void customerAccess() {

     System.out.println();
     System.out.println("Customer Access Granted");
     System.out.println("Welcome to your account.");
 }


 public void displayBalance() {

     System.out.println(
             "Account Balance : ₹" + accountBalance
     );
 }
}


//=====================================================
//AUTHENTICATION SYSTEM
//=====================================================

class AuthenticationSystem implements LoginOperations {

 private User[] users;
 private int userCount;
 private User currentUser;


 // Constructor
 public AuthenticationSystem(int size) {

     users = new User[size];

     userCount = 0;

     currentUser = null;
 }


 // =================================================
 // ADD USER
 // =================================================

 public void addUser(User user) {

     if (userCount < users.length) {

         users[userCount] = user;

         userCount++;

     } else {

         System.out.println(
                 "User storage is full."
         );
     }
 }


 // =================================================
 // FIND USER
 // =================================================

 private User findUser(String username)
         throws InvalidUserException {

     for (int i = 0; i < userCount; i++) {

         if (users[i].getUsername()
                 .equals(username)) {

             return users[i];
         }
     }


     throw new InvalidUserException(
             "Username does not exist."
     );
 }


 // =================================================
 // LOGIN
 // =================================================

 public void login(String username, String password)
         throws InvalidUserException,
                InvalidPasswordException,
                WeakPasswordException,
                AccountBlockedException {


     // Check null
     if (username == null || password == null) {

         throw new NullPointerException(
                 "Username or password cannot be null."
         );
     }


     // Check empty
     if (username.trim().equals("")
             || password.trim().equals("")) {

         throw new NullPointerException(
                 "Username or password cannot be empty."
         );
     }


     // Check password length
     if (password.length() < 8) {

         throw new WeakPasswordException(
                 "Password is too short. Minimum 8 characters required."
         );
     }


     // Find user
     User user = findUser(username);


     // Check account blocked
     if (user.loginAttempts >= 3) {

         throw new AccountBlockedException(
                 "Account is blocked after 3 failed attempts."
         );
     }


     // Check password
     if (!user.getPassword().equals(password)) {

         user.loginAttempts++;


         if (user.loginAttempts >= 3) {

             throw new AccountBlockedException(
                     "Account blocked. Maximum login attempts exceeded."
             );
         }


         throw new InvalidPasswordException(
                 "Incorrect password. Attempt "
                 + user.loginAttempts + " of 3."
         );
     }


     // Successful login
     user.loggedIn = true;

     user.loginAttempts = 0;

     currentUser = user;


     System.out.println();
     System.out.println("LOGIN SUCCESSFUL");
     System.out.println(
             "Welcome " + user.getUsername()
     );
 }


 // =================================================
 // ADD NEW USER
 // =================================================

 public void addNewUser(Scanner sc)
         throws WeakPasswordException {


     System.out.println();
     System.out.println("========== ADD NEW USER ==========");


     // User ID
     System.out.print("Enter User ID: ");
     int userId = Integer.parseInt(
             sc.nextLine()
     );


     // Username
     System.out.print("Enter Username: ");
     String username = sc.nextLine();


     // Password
     System.out.print("Enter Password: ");
     String password = sc.nextLine();


     // Validate password
     if (password.length() < 8) {

         throw new WeakPasswordException(
                 "Password must contain at least 8 characters."
         );
     }


     // Email
     System.out.print("Enter Email: ");
     String email = sc.nextLine();


     // Select user type
     System.out.println();
     System.out.println("Select User Type");
     System.out.println("1. Admin");
     System.out.println("2. Customer");

     System.out.print("Enter your choice: ");

     int type = Integer.parseInt(
             sc.nextLine()
     );


     // Create Admin
     if (type == 1) {

         System.out.print("Enter Department: ");
         String department = sc.nextLine();


         Admin admin = new Admin(
                 userId,
                 username,
                 password,
                 email,
                 department
         );


         addUser(admin);


         System.out.println(
                 "New Admin added successfully."
         );
     }


     // Create Customer
     else if (type == 2) {

         System.out.print("Enter City: ");
         String city = sc.nextLine();


         System.out.print("Enter Account Balance: ");
         double balance = Double.parseDouble(
                 sc.nextLine()
         );


         Customer customer = new Customer(
                 userId,
                 username,
                 password,
                 email,
                 city,
                 balance
         );


         addUser(customer);


         System.out.println(
                 "New Customer added successfully."
         );
     }


     else {

         System.out.println(
                 "Invalid user type."
         );
     }
 }


 // =================================================
 // LOGOUT
 // =================================================

 public void logout() {

     if (currentUser != null) {

         currentUser.loggedIn = false;

         System.out.println(
                 "Logged out successfully."
         );

         currentUser = null;

     } else {

         System.out.println(
                 "No user is currently logged in."
         );
     }
 }


 // =================================================
 // DASHBOARD
 // =================================================

 public void displayDashboard() {

     if (currentUser == null) {

         System.out.println(
                 "Please login first."
         );

         return;
     }


     System.out.println();
     System.out.println("========== DASHBOARD ==========");


     currentUser.displayUser();


     // Admin dashboard
     if (currentUser instanceof Admin) {

         Admin admin =
                 (Admin) currentUser;

         admin.adminDetails();

         admin.adminAccess();
     }


     // Customer dashboard
     else if (currentUser instanceof Customer) {

         Customer customer =
                 (Customer) currentUser;

         customer.customerDetails();

         customer.customerAccess();

         customer.displayBalance();
     }
 }


 // =================================================
 // CHANGE PASSWORD
 // =================================================

 public void changePassword(
         String oldPassword,
         String newPassword)
         throws InvalidPasswordException,
                WeakPasswordException {


     if (currentUser == null) {

         System.out.println(
                 "Please login first."
         );

         return;
     }


     // Check old password
     if (!currentUser.getPassword()
             .equals(oldPassword)) {

         throw new InvalidPasswordException(
                 "Old password is incorrect."
         );
     }


     // Set new password
     currentUser.setPassword(newPassword);


     System.out.println(
             "Password changed successfully."
     );
 }


 // =================================================
 // SEARCH USER
 // =================================================

 public void searchUser(String username) {

     for (int i = 0; i < userCount; i++) {

         if (users[i].getUsername()
                 .equals(username)) {


             System.out.println();
             System.out.println("User Found!");


             users[i].displayUser();


             if (users[i] instanceof Admin) {

                 Admin admin =
                         (Admin) users[i];

                 admin.adminDetails();
             }


             else if (users[i] instanceof Customer) {

                 Customer customer =
                         (Customer) users[i];

                 customer.customerDetails();
             }


             return;
         }
     }


     System.out.println(
             "User not found."
     );
 }


 // =================================================
 // DISPLAY ALL USERS
 // =================================================

 public void displayAllUsers() {

     System.out.println();
     System.out.println(
             "========== REGISTERED USERS =========="
     );


     if (userCount == 0) {

         System.out.println(
                 "No users registered."
         );

         return;
     }


     for (int i = 0; i < userCount; i++) {

         System.out.println();

         System.out.println(
                 "User " + (i + 1)
         );


         users[i].displayUser();


         if (users[i] instanceof Admin) {

             Admin admin =
                     (Admin) users[i];

             admin.adminDetails();
         }


         else if (users[i] instanceof Customer) {

             Customer customer =
                     (Customer) users[i];

             customer.customerDetails();
         }
     }
 }
}


//=====================================================
//MAIN CLASS
//=====================================================

public class LoginAuthentication {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);


     // Create authentication system
     AuthenticationSystem system =
             new AuthenticationSystem(20);


     // =================================================
     // DEFAULT ADMIN
     // =================================================

     Admin admin =
             new Admin(
                     101,
                     "admin",
                     "admin123",
                     "admin@company.com",
                     "Administrative Department"
             );


     // =================================================
     // DEFAULT CUSTOMER 1
     // =================================================

     Customer customer1 =
             new Customer(
                     102,
                     "kodees",
                     "kodees1401",
                     "kodees@gmail.com",
                     "Erode",
                     35000
             );


     // =================================================
     // DEFAULT CUSTOMER 2
     // =================================================

     Customer customer2 =
             new Customer(
                     103,
                     "adams",
                     "adams1234",
                     "adams@gmail.com",
                     "Chennai",
                     40000
             );


     // Add default users
     // No message will be printed here

     system.addUser(admin);
     system.addUser(customer1);
     system.addUser(customer2);


     int choice = 0;


     // =================================================
     // MAIN MENU
     // =================================================

     do {

         System.out.println();

         System.out.println(
                 "========== LOGIN AUTHENTICATION SYSTEM =========="
         );

         System.out.println("1. Login");
         System.out.println("2. Dashboard");
         System.out.println("3. Add New User");
         System.out.println("4. Change Password");
         System.out.println("5. Search User");
         System.out.println("6. Display All Users");
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
                         "Enter username: "
                 );

                 String username =
                         sc.nextLine();


                 System.out.print(
                         "Enter password: "
                 );

                 String password =
                         sc.nextLine();


                 try {

                     system.login(
                             username,
                             password
                     );
                 }


                 catch (
                         InvalidUserException |
                         InvalidPasswordException |
                         WeakPasswordException |
                         AccountBlockedException e) {

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
             // 2. DASHBOARD
             // =================================================

             else if (choice == 2) {

                 system.displayDashboard();
             }


             // =================================================
             // 3. ADD NEW USER
             // =================================================

             else if (choice == 3) {

                 try {

                     system.addNewUser(sc);
                 }


                 catch (WeakPasswordException e) {

                     System.out.println(
                             "USER ERROR: "
                             + e.getMessage()
                     );
                 }


                 catch (NumberFormatException e) {

                     System.out.println(
                             "Please enter valid numeric values."
                     );
                 }


                 finally {

                     System.out.println(
                             "User registration process completed."
                     );
                 }
             }


             // =================================================
             // 4. CHANGE PASSWORD
             // =================================================

             else if (choice == 4) {

                 System.out.print(
                         "Enter old password: "
                 );

                 String oldPassword =
                         sc.nextLine();


                 System.out.print(
                         "Enter new password: "
                 );

                 String newPassword =
                         sc.nextLine();


                 try {

                     system.changePassword(
                             oldPassword,
                             newPassword
                     );
                 }


                 catch (
                         InvalidPasswordException |
                         WeakPasswordException e) {

                     System.out.println(
                             "PASSWORD ERROR: "
                             + e.getMessage()
                     );
                 }


                 finally {

                     System.out.println(
                             "Password operation completed."
                     );
                 }
             }


             // =================================================
             // 5. SEARCH USER
             // =================================================

             else if (choice == 5) {

                 System.out.print(
                         "Enter username to search: "
                 );

                 String username =
                         sc.nextLine();


                 system.searchUser(username);
             }


             // =================================================
             // 6. DISPLAY ALL USERS
             // =================================================

             else if (choice == 6) {

                 system.displayAllUsers();
             }


             // =================================================
             // 7. LOGOUT
             // =================================================

             else if (choice == 7) {

                 system.logout();
             }


             // =================================================
             // 8. EXIT
             // =================================================

             else if (choice == 8) {

                 System.out.println();
                 System.out.println(
                         "Thank you for using the system."
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