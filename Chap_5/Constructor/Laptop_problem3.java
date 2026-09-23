package Constructor;

import java.util.Scanner;

class Laptop_problem3 {

    String company;
    double cost;

    // Parameterized Constructor
    Laptop_problem3(String company, double cost) {
        this.company = company;
        this.cost = cost;
    }

    void display() {
        System.out.println("\n----- Laptop Details -----");
        System.out.println("Company : " + company);
        System.out.println("Cost    : Rs." + cost);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Laptop Company: ");
        String company = sc.nextLine();

        System.out.print("Enter Laptop Cost: ");
        double cost = sc.nextDouble();

        // Passing user input to Parameterized Constructor
        Laptop_problem3 l1 = new Laptop_problem3(company, cost);

        l1.display();

        sc.close();
    }
}
