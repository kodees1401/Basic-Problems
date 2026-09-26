package Using_Super;

//Exercise 6: Single inheritance - Employee inherits from Person

class PersonSix {
 String name;

 PersonSix(String name) {
     this.name = name;
 }

 void display() {
     System.out.println("Name: " + name);
 }
}

class EmployeeSix extends PersonSix {
 double salary;

 EmployeeSix(String name, double salary) {
     super(name);
     this.salary = salary;
 }

 @Override
 void display() {
     super.display();
     System.out.println("Salary: " + salary);
 }
}

public class Exercise6 {
 public static void main(String[] args) {
     EmployeeSix emp = new EmployeeSix("John", 55000.0);
     emp.display();
 }
}
