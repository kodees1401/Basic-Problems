package class_program; // To Print Person Class — name, age, city
import java.util.Scanner;

class Person {
    String name;
    int age;
    String city;
 
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}

public class Problem10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
 
        System.out.print("Enter name: ");
        p1.name = sc.nextLine();
        System.out.print("Enter age: ");
        p1.age = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Enter city: ");
        p1.city = sc.nextLine();
 
        p1.showInfo();

        sc.close();
	}

}
