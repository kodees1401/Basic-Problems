package Inheritance;

import java.util.Scanner;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Employee extends Person {

    int employeeId;
    double salary;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Salary      : Rs." + salary);
    }
}

class Manager extends Employee {

    String department;

    Manager(String name, int age, int employeeId,
            double salary, String department) {

        super(name, age, employeeId, salary);
        this.department = department;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Department  : " + department);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Manager Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Employee ID: ");
        int employeeId = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        Manager m = new Manager(
            name, age, employeeId, salary, department
        );

        System.out.println("\n----- Manager Details -----");
        m.displayManager();

        sc.close();
    }
}
