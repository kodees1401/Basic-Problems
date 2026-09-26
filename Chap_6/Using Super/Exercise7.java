package Using_Super;

//Exercise 7: Multilevel inheritance (Grandparent -> Parent -> Child)

class GrandparentSeven {
 void showGrandparent() {
     System.out.println("This is the Grandparent class method.");
 }
}

class ParentSeven extends GrandparentSeven {
 void showParent() {
     System.out.println("This is the Parent class method.");
 }
}

class ChildSeven extends ParentSeven {
 void showChild() {
     System.out.println("This is the Child class method.");
 }
}

public class Exercise7 {
 public static void main(String[] args) {
     ChildSeven c = new ChildSeven();
     c.showGrandparent(); // inherited from GrandparentSeven
     c.showParent();      // inherited from ParentSeven
     c.showChild();       // defined in ChildSeven
 }
}
