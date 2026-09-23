package Using_this;

import java.util.Scanner;

class Object {

    String name;
    double salary;

    Object(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void compareSalary(Object e) {

        if (this.salary > e.salary) {
            System.out.println(this.name + " has higher salary.");
        } 
        else if (this.salary < e.salary) {
            System.out.println(e.name + " has higher salary.");
        } 
        else {
            System.out.println("Both employees have the same salary.");
        }
    }

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Salary : Rs." + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Employee Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter First Employee Salary: ");
        double salary1 = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Second Employee Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Second Employee Salary: ");
        double salary2 = sc.nextDouble();

        Object e1 = new Object(name1, salary1);
        Object e2 = new Object(name2, salary2);

        System.out.println("\n----- Employee 1 -----");
        e1.display();

        System.out.println("\n----- Employee 2 -----");
        e2.display();

        // Passing current object e1 using this
        e1.compareSalary(e2);

        sc.close();
    }
}