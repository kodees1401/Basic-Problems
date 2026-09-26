package Using_Super;

//Exercise 5: Real-world example (Vehicle -> Car) using super in all three forms:
//1) super.variable  2) super.method()  3) super(...) constructor call

class VehicleFive {
 String type = "Generic Vehicle";

 VehicleFive(String name) {
     System.out.println("Vehicle constructor called for: " + name);
 }

 void start() {
     System.out.println("Vehicle is starting...");
 }
}

class CarFive extends VehicleFive {
 String type = "Car";

 CarFive(String name) {
     super(name); // Form 1: calling parent constructor
 }

 @Override
 void start() {
     super.start(); // Form 2: calling parent method
     System.out.println("Car engine starts with a key/button.");
 }

 void showType() {
     System.out.println("Car's type    : " + type);
     System.out.println("Vehicle's type: " + super.type); // Form 3: accessing parent variable
 }
}

public class Exercise5 {
 public static void main(String[] args) {
     CarFive myCar = new CarFive("Sedan");
     myCar.start();
     myCar.showType();
 }
}
