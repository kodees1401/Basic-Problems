package Constructor;

import java.util.Scanner;

class Student_problem2 {

    String name;
    int rollNo;
    double marks;

    // Default Constructor
    Student_problem2() {
        name = "";
        rollNo = 0;
        marks = 0;
    }

    void display() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks      : " + marks);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student_problem2 s1 = new Student_problem2();

        System.out.print("Enter Student Name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        s1.rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        s1.marks = sc.nextDouble();

        s1.display();

        sc.close();
    }
}