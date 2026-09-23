package Using_this;

import java.util.Scanner;

class Employee {

    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("\n----- Employee Details -----");
        System.out.println("Name   : " + name);
        System.out.println("Salary : Rs." + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(name, salary);

        e.display();

        sc.close();
    }
}
