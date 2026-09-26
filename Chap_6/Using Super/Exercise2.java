package Using_Super;



//Exercise 2: Child class overrides a method and uses super.method() to call the parent version

class ParentTwo {
 void greet() {
     System.out.println("Hello from Parent class");
 }
}

class ChildTwo extends ParentTwo {
 @Override
 void greet() {
     super.greet();                     // calls ParentTwo's greet()
     System.out.println("Hello from Child class");
 }
}

public class Exercise2 {
 public static void main(String[] args) {
     ChildTwo c = new ChildTwo();
     c.greet();
 }
}
