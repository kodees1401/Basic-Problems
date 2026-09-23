package Constructor;

import java.util.Scanner;

class Car {

    String model;
    String color;
    double price;
    int year;

    // Default Constructor
    Car() {
        model = "Not Given";
        color = "Not Given";
        price = 0;
        year = 0;
    }
    void startCar() {
        System.out.println("Car started successfully.");
    }

    void stopCar() {
        System.out.println("Car stopped successfully.");
    }
    void displayDetails() {
        System.out.println("\n----- Car Details -----");
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Price : Rs." + price);
        System.out.println("Year  : " + year);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating object using Default Constructor
        Car c1 = new Car();

        System.out.print("Enter Car Model: ");
        c1.model = sc.nextLine();

        System.out.print("Enter Car Color: ");
        c1.color = sc.nextLine();

        System.out.print("Enter Car Price: ");
        c1.price = sc.nextDouble();

        System.out.print("Enter Car Year: ");
        c1.year = sc.nextInt();

        c1.displayDetails();
        c1.startCar();
        c1.stopCar();

        sc.close();
    }
}