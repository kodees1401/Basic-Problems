package Using_this;

import java.util.Scanner;

class Laptop {

    String company;
    String model;
    double price;

    Laptop setCompany(String company) {
        this.company = company;
        return this;
    }

    Laptop setModel(String model) {
        this.model = model;
        return this;
    }

    Laptop setPrice(double price) {
        this.price = price;
        return this;
    }

    void display() {
        System.out.println("\n----- Laptop Details -----");
        System.out.println("Company : " + company);
        System.out.println("Model   : " + model);
        System.out.println("Price   : Rs." + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Laptop Company: ");
        String company = sc.nextLine();

        System.out.print("Enter Laptop Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Laptop Price: ");
        double price = sc.nextDouble();

        Laptop l = new Laptop();

        // Method Chaining
        l.setCompany(company)
         .setModel(model)
         .setPrice(price)
         .display();

        sc.close();
    }
}
