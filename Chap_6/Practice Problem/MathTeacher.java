package Pratice_problems;

import java.util.Scanner;

class Teacher {

    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void displayTeacher() {
        System.out.println("Teacher Name : " + name);
        System.out.println("Subject      : " + subject);
    }
}

// Child class
class MathTeacher extends Teacher {

    int experience;

    MathTeacher(String name, String subject, int experience) {
        super(name, subject);
        this.experience = experience;
    }

    void displayMathTeacher() {
        displayTeacher();
        System.out.println("Experience   : " + experience + " years");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Teacher Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        System.out.print("Enter Experience: ");
        int experience = sc.nextInt();

        MathTeacher mt = new MathTeacher(name, subject, experience);

        System.out.println("\n----- Math Teacher Details -----");
        mt.displayMathTeacher();

        sc.close();
    }
}