package class_program; // To print Employee Class — Get Details from User as Input
import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;
 
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter employee ID: ");
        id = sc.nextInt();
        System.out.print("Enter employee salary: ");
        salary = sc.nextDouble();
        
        sc.close();
    }
 
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class Problem3 {

	public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getDetails();
        emp.display();
	}

}
