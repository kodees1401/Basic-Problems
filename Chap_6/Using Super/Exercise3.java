package Using_Super;

//Exercise 3: Calling a parameterized constructor of a parent class using super()

class ParentThree {
 ParentThree(String name) {
     System.out.println("Parent constructor called with name: " + name);
 }
}

class ChildThree extends ParentThree {
 ChildThree(String name, int age) {
     super(name); // must be the first statement in the constructor
     System.out.println("Child constructor called with age: " + age);
 }
}

public class Exercise3 {
 public static void main(String[] args) {
     ChildThree c = new ChildThree("Alice", 10);
 }
}