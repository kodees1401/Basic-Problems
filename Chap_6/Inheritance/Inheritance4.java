package Inheritance;

import java.util.Scanner;

interface Printable {

    void printDetails();
}

interface Calculable {

    void calculateSalary();
}

class Employees implements Printable, Calculable {

    String name;
    double basicSalary;
    double bonus;
    double totalSalary;

    Employees(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public void calculateSalary() {
        totalSalary = basicSalary + bonus;
    }

    public void printDetails() {
        System.out.println("\n----- Employee Details -----");
        System.out.println("Name         : " + name);
        System.out.println("Basic Salary : Rs." + basicSalary);
        System.out.println("Bonus        : Rs." + bonus);
        System.out.println("Total Salary : Rs." + totalSalary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();

        Employees e = new Employees(name, salary, bonus);

        e.calculateSalary();
        e.printDetails();

        sc.close();
    }
}
