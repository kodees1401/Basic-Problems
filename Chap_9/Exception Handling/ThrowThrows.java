package Execption;

import java.util.Scanner;

public class ThrowThrows {

    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("You are not eligible to vote.");
        }

        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
