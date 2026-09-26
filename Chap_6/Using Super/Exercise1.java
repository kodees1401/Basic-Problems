package Using_Super;

//Exercise 1: Using super to access parent class variable when child has a variable with the same name

class ParentOne {
 int x = 10;
}

class ChildOne extends ParentOne {
 int x = 20;

 void show() {
     System.out.println("Child class x  : " + x);       // refers to ChildOne's x
     System.out.println("Parent class x : " + super.x); // refers to ParentOne's x using super
 }
}

public class Exercise1 {
 public static void main(String[] args) {
     ChildOne c = new ChildOne();
     c.show();
 }
}