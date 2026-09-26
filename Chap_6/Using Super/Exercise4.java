package Using_Super;

//Exercise 4: What happens if you remove super() from the child constructor?
//
//CASE A: Parent has a no-argument constructor.
//Even if you don't write super() explicitly, Java automatically inserts an
//implicit call to the parent's no-arg constructor. So this compiles fine.

class ParentFour {
 ParentFour() {
     System.out.println("Parent no-arg constructor called (implicitly)");
 }
}

class ChildFour extends ParentFour {
 ChildFour() {
     // no super() written here, but compiler inserts super() automatically
     System.out.println("Child constructor called");
 }
}

public class Exercise4 {
 public static void main(String[] args) {
     System.out.println("--- Case A: Parent has a no-arg constructor ---");
     ChildFour c = new ChildFour();

     System.out.println();
     System.out.println("--- Case B: Parent has ONLY a parameterized constructor ---");
     System.out.println("If ParentFourAlt looked like this:");
     System.out.println("    class ParentFourAlt { ParentFourAlt(String n) { ... } }");
     System.out.println("and ChildFourAlt's constructor did NOT call super(n) explicitly,");
     System.out.println("Java would try to insert an implicit super() call,");
     System.out.println("but ParentFourAlt has no no-arg constructor to call.");
     System.out.println("Result: COMPILE-TIME ERROR:");
     System.out.println("  \"implicit super constructor ParentFourAlt() is undefined for default constructor.");
     System.out.println("   Must define an explicit constructor\"");
 }
}

/*
Uncomment the block below to see the actual compile error described above:

class ParentFourAlt {
 ParentFourAlt(String n) {
     System.out.println("ParentFourAlt constructor: " + n);
 }
}

class ChildFourAlt extends ParentFourAlt {
 ChildFourAlt() {
     // ERROR: no super(n) call, and ParentFourAlt has no no-arg constructor
     System.out.println("ChildFourAlt constructor");
 }
}
*/
