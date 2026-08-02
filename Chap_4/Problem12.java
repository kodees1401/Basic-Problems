package class_program; // To Print Teacher Class — Set Details and Display Them
import java.util.Scanner;

class Teacher {
    String name;
    String subject;
 
    void setDetails(String n, String s) {
        name = n;
        subject = s;
    }
 
    void displayDetails() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

public class Problem12 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher t1 = new Teacher();
 
        System.out.print("Enter teacher name: ");
        String name = sc.nextLine();
        System.out.print("Enter subject: ");
        String subject = sc.nextLine();
 
        t1.setDetails(name, subject);
        t1.displayDetails();
        
        sc.close();

	}

}
