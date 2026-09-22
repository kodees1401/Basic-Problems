package Execption;

import java.util.Scanner;

public class Multicatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            System.out.print("Enter another number: ");
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result = " + result);

            int[] numbers = {10, 20, 30};
            System.out.println("Array value = " + numbers[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }
        catch (Exception e) {
            System.out.println("Some other error occurred.");
        }

        sc.close();
    }
}
