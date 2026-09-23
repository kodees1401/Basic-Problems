package Using_this;

import java.util.Scanner;

class Methods {

    String name;
    int marks;

    Methods(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void showName() {
        System.out.println("Student Name: " + name);
    }

    void showMarks() {
        System.out.println("Student Marks: " + marks);
    }

    void display() {
        System.out.println("\n----- Student Details -----");

        // Calling current class methods using this
        this.showName();
        this.showMarks();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        Methods s = new Methods(name, marks);

        s.display();

        sc.close();
    }
}
