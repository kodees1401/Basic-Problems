package Using_Super;

//Exercise 8: Use of super keyword for calling parent class constructor

class PersonEight {
 PersonEight() {
     System.out.println("Person constructor called.");
 }
}

class StudentEight extends PersonEight {
 StudentEight() {
     super(); // explicitly calling parent's no-arg constructor
     System.out.println("Student constructor called.");
 }
}

public class Exercise8 {
 public static void main(String[] args) {
     StudentEight s = new StudentEight();
 }
}
