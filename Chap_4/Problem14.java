package class_program; // To print StudentMarks Class — Total and Average of Three Subjects
import java.util.Scanner;

class StudentMarks {
    double mark1, mark2, mark3;
 
    double calculateTotal() {
        return mark1 + mark2 + mark3;
    }
 
    double calculateAverage() {
        return calculateTotal() / 3;
    }
}

public class Problem14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StudentMarks sm = new StudentMarks();
 
        System.out.print("Enter marks for subject 1: ");
        sm.mark1 = sc.nextDouble();
        System.out.print("Enter marks for subject 2: ");
        sm.mark2 = sc.nextDouble();
        System.out.print("Enter marks for subject 3: ");
        sm.mark3 = sc.nextDouble();
 
        System.out.println("Total Marks: " + sm.calculateTotal());
        System.out.println("Average Marks: " + sm.calculateAverage());

        sc.close();

	}

}
