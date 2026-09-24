package Inheritance;

import java.util.Scanner;

class Person1 {

    String name;

    Person1(String name) {
        this.name = name;
    }

    void displayPerson() {
        System.out.println("Name       : " + name);
    }
}

class Employee2 extends Person1 {

    int employeeId;
    double salary;

    Employee2(String name, int employeeId, double salary) {
        super(name);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary     : Rs." + salary);
    }
}

interface BonusCalculator {

    void calculateBonus();
}

class Manager1 extends Employee2 implements BonusCalculator {

    String department;
    double bonus;

    Manager1(String name, int employeeId, double salary,
            String department) {

        super(name, employeeId, salary);
        this.department = department;
    }

    public void calculateBonus() {
        bonus = salary * 0.10;
    }

    void displayManager() {
        System.out.println("\n----- Manager Details -----");

        displayEmployee();

        System.out.println("Department : " + department);
        System.out.println("Bonus      : Rs." + bonus);
        System.out.println("Total      : Rs." + (salary + bonus));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Manager Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int employeeId = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        Manager1 m = new Manager1(
            name, employeeId, salary, department
        );

        m.calculateBonus();
        m.displayManager();

        sc.close();
    }
}
