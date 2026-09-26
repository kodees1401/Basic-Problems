package Using_Super;

//Exercise 9: Method overriding using super

class ShapeNine {
 void area() {
     System.out.println("Calculating area of a generic shape.");
 }
}

class CircleNine extends ShapeNine {
 double radius = 5.0;

 @Override
 void area() {
     super.area(); // calls the parent's version first
     double result = Math.PI * radius * radius;
     System.out.println("Area of Circle = " + result);
 }
}

public class Exercise9 {
 public static void main(String[] args) {
     CircleNine c = new CircleNine();
     c.area();
 }
}