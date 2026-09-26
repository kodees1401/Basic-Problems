package Using_Super;

//Exercise 10: Hierarchical inheritance - Teacher, Student, and Staff all inherit from Person

class PersonTen {
 String name;

 PersonTen(String name) {
     this.name = name;
 }

 void display() {
     System.out.println("Name: " + name);
 }
}

class TeacherTen extends PersonTen {
 TeacherTen(String name) {
     super(name);
 }

 void role() {
     System.out.println(name + " works as a Teacher.");
 }
}

class StudentTen extends PersonTen {
 StudentTen(String name) {
     super(name);
 }

 void role() {
     System.out.println(name + " studies as a Student.");
 }
}

class StaffTen extends PersonTen {
 StaffTen(String name) {
     super(name);
 }

 void role() {
     System.out.println(name + " works as a Staff member.");
 }
}

public class Exercise10 {
 public static void main(String[] args) {
     TeacherTen t = new TeacherTen("Mr. Sharma");
     StudentTen s = new StudentTen("Priya");
     StaffTen st = new StaffTen("Ramesh");

     t.display(); t.role();
     s.display(); s.role();
     st.display(); st.role();
 }
}