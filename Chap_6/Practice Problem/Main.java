package Pratice_problems;

import java.util.Scanner;

class Vehicle {

    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayVehicle() {
        System.out.println("Brand : " + brand);
        System.out.println("Year  : " + year);
    }
}

class Car extends Vehicle {

    int doors;

    Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    void displayCar() {
        System.out.println("\n----- Car Details -----");
        displayVehicle();
        System.out.println("Doors : " + doors);
    }
}

class Bike extends Vehicle {

    int engineCC;

    Bike(String brand, int year, int engineCC) {
        super(brand, year);
        this.engineCC = engineCC;
    }

    void displayBike() {
        System.out.println("\n----- Bike Details -----");
        displayVehicle();
        System.out.println("Engine : " + engineCC + " CC");
    }
}

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car Brand: ");
        String carBrand = sc.nextLine();

        System.out.print("Enter Car Year: ");
        int carYear = sc.nextInt();

        System.out.print("Enter Number of Doors: ");
        int doors = sc.nextInt();

        sc.nextLine();

        System.out.print("\nEnter Bike Brand: ");
        String bikeBrand = sc.nextLine();

        System.out.print("Enter Bike Year: ");
        int bikeYear = sc.nextInt();

        System.out.print("Enter Bike Engine CC: ");
        int engineCC = sc.nextInt();

        Car car = new Car(carBrand, carYear, doors);
        Bike bike = new Bike(bikeBrand, bikeYear, engineCC);

        car.displayCar();
        bike.displayBike();

        sc.close();
    }
}
