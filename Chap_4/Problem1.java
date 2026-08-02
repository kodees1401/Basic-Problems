package class_program; // To print the Student Class — name, age
import java.util.Scanner;

class Student {
    String name;
    int age;
}

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
 
        System.out.print("Enter student name: ");
        s1.name = sc.nextLine();
        System.out.print("Enter student age: ");
        s1.age = sc.nextInt();
 
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        sc.close();
	}

}
