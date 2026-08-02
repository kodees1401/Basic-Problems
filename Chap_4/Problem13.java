package class_program; // To Print Animal Class — sound() Method (Multiple Objects)
import java.util.Scanner;

class Animal {
    String name;
 
    void sound() {
        System.out.println(name + " makes a sound");
    }
}

public class Problem13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        Animal a1 = new Animal();
        System.out.print("Enter name of animal 1: ");
        a1.name = sc.nextLine();
        
 
        Animal a2 = new Animal();
        System.out.print("Enter name of animal 2: ");
        a2.name = sc.nextLine();
        
 
        Animal a3 = new Animal();
        System.out.print("Enter name of animal 3: ");
        a3.name = sc.nextLine();
        a1.sound();
        a2.sound();
        a3.sound();

        sc.close();

	}

}
