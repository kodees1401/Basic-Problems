package Execption;

import java.util.Scanner;


//=====================================================
//CUSTOM EXCEPTION 1 - INVALID STUDENT
//=====================================================

class InvalidStudentException extends Exception {

 private static final long serialVersionUID = 1L;

 public InvalidStudentException(String message) {
     super(message);
 }
}


//=====================================================
//CUSTOM EXCEPTION 2 - INVALID MARKS
//=====================================================

class InvalidMarksException extends Exception {

 private static final long serialVersionUID = 1L;

 public InvalidMarksException(String message) {
     super(message);
 }
}


//=====================================================
//CUSTOM EXCEPTION 3 - FAIL
//=====================================================

class FailException extends Exception {

 private static final long serialVersionUID = 1L;

 public FailException(String message) {
     super(message);
 }
}


//=====================================================
//RESULT INTERFACE
//=====================================================

interface StudentOperations {

 void selectStudent(String rollNumber)
         throws InvalidStudentException;

 void enterMarks(int[] marks)
         throws InvalidMarksException;

 void generateResult()
         throws FailException;

 void deselectStudent();
}


//=====================================================
//STUDENT CLASS
//=====================================================

class Student {

 public static final int MAX_MARKS = 100;
 public static final int PASS_MARK = 35;
 public static final int MAX_TOTAL = 300;

 public static final String[] SUBJECTS =
         {"Mathematics", "Science", "English"};

 private String rollNumber;
 private String name;
 private int[] marks;
 private int total;
 private double percentage;

 protected boolean selected;
 protected boolean marksEntered;


 // Constructor
 public Student(String rollNumber,
                String name) {

     this.rollNumber = rollNumber;
     this.name = name;

     this.marks = null;
     this.total = 0;
     this.percentage = 0;

     this.selected = false;
     this.marksEntered = false;
 }


 // Getter methods

 public String getRollNumber() {
     return rollNumber;
 }


 public String getName() {
     return name;
 }


 public int[] getMarks() {
     return marks;
 }


 public int getTotal() {
     return total;
 }


 // =================================================
 // SET MARKS
 // =================================================

 public void setMarks(int[] newMarks)
         throws InvalidMarksException {


     // No marks given
     if (newMarks == null) {

         throw new NullPointerException(
                 "No marks given."
         );
     }


     // Marks needed for every subject
     if (newMarks.length != SUBJECTS.length) {

         throw new InvalidMarksException(
                 "Marks must be given for all "
                 + SUBJECTS.length + " subjects."
         );
     }


     int sum = 0;


     // Each mark must be between 0 and 100
     for (int i = 0; i < newMarks.length; i++) {

         if (newMarks[i] < 0
                 || newMarks[i] > MAX_MARKS) {

             throw new InvalidMarksException(
                     "Invalid marks for " + SUBJECTS[i]
                     + ": " + newMarks[i]
                     + ". Marks must be between 0 and 100."
             );
         }

         sum = sum + newMarks[i];
     }


     // Safety check - total must not exceed 300
     if (sum > MAX_TOTAL) {

         throw new InvalidMarksException(
                 "Total marks cannot exceed " + MAX_TOTAL + "."
         );
     }


     // All checks passed - store the marks
     marks = newMarks.clone();

     total = sum;

     marksEntered = true;
 }


 // =================================================
 // CALCULATE PERCENTAGE
 // =================================================

 public double calculatePercentage() {

     // No marks given
     if (marks == null) {

         throw new NullPointerException(
                 "No marks given. Please enter marks first."
         );
     }


     int maxTotal = marks.length * MAX_MARKS;


     // Safety check - avoid division by zero
     if (maxTotal == 0) {

         throw new ArithmeticException(
                 "Cannot calculate percentage. Maximum marks is zero."
         );
     }


     percentage = (total * 100.0) / maxTotal;

     return percentage;
 }


 // =================================================
 // CHECK PASS / FAIL
 // =================================================

 public void checkPass()
         throws FailException {

     String failedSubjects = "";


     for (int i = 0; i < marks.length; i++) {

         if (marks[i] < PASS_MARK) {

             if (!failedSubjects.equals("")) {

                 failedSubjects = failedSubjects + ", ";
             }

             failedSubjects = failedSubjects
                     + SUBJECTS[i]
                     + " (" + marks[i] + ")";
         }
     }


     if (!failedSubjects.equals("")) {

         throw new FailException(
                 "Failed in: " + failedSubjects
                 + ". Minimum " + PASS_MARK
                 + " marks required in each subject."
         );
     }
 }


 // =================================================
 // GRADE
 // =================================================

 public String getGrade(double percent) {

     if (percent >= 90) {
         return "O (Outstanding)";
     }

     else if (percent >= 80) {
         return "A (Excellent)";
     }

     else if (percent >= 70) {
         return "B (Very Good)";
     }

     else if (percent >= 60) {
         return "C (Good)";
     }

     else if (percent >= 50) {
         return "D (Average)";
     }

     else {
         return "E (Satisfactory)";
     }
 }


 // Display student details
 public void displayStudent() {

     System.out.println();
     System.out.println("Student Details");
     System.out.println("Roll Number : " + rollNumber);
     System.out.println("Name        : " + name);
 }


 // Method overloading
 public void displayStudent(boolean showResult) {

     displayStudent();

     if (showResult) {

         if (marksEntered) {

             System.out.println("Total Marks : " + total
                     + " / " + MAX_TOTAL);
         }

         else {

             System.out.println("Marks       : Not entered");
         }
     }
 }
}


//=====================================================
//HOSTEL STUDENT CLASS
//=====================================================

class HostelStudent extends Student {

 private String hostelName;


 public HostelStudent(String rollNumber,
                      String name,
                      String hostelName) {

     super(rollNumber, name);

     this.hostelName = hostelName;
 }


 public void hostelDetails() {

     System.out.println();
     System.out.println("Student Type : HOSTEL STUDENT");
     System.out.println("Hostel       : " + hostelName);
 }
}


//=====================================================
//DAY SCHOLAR CLASS
//=====================================================

class DayScholar extends Student {

 private String city;


 public DayScholar(String rollNumber,
                   String name,
                   String city) {

     super(rollNumber, name);

     this.city = city;
 }


 public void dayScholarDetails() {

     System.out.println();
     System.out.println("Student Type : DAY SCHOLAR");
     System.out.println("City         : " + city);
 }
}


//=====================================================
//RESULT SYSTEM
//=====================================================

class ResultSystem implements StudentOperations {

 private Student[] students;
 private int studentCount;
 private Student currentStudent;


 // Constructor
 public ResultSystem(int size) {

     students = new Student[size];

     studentCount = 0;

     currentStudent = null;
 }


 // =================================================
 // ADD STUDENT
 // =================================================

 public void addStudent(Student student) {

     if (studentCount < students.length) {

         students[studentCount] = student;

         studentCount++;

     } else {

         System.out.println(
                 "Student storage is full."
         );
     }
 }


 // =================================================
 // FIND STUDENT
 // =================================================

 private Student findStudent(String rollNumber)
         throws InvalidStudentException {

     for (int i = 0; i < studentCount; i++) {

         if (students[i].getRollNumber()
                 .equals(rollNumber)) {

             return students[i];
         }
     }


     throw new InvalidStudentException(
             "Roll number does not exist."
     );
 }


 // =================================================
 // CHECK SELECTED STUDENT
 // =================================================

 public boolean hasSelectedStudent() {

     return currentStudent != null;
 }


 // =================================================
 // SELECT STUDENT
 // =================================================

 public void selectStudent(String rollNumber)
         throws InvalidStudentException {


     // Check null
     if (rollNumber == null) {

         throw new NullPointerException(
                 "Roll number cannot be null."
         );
     }


     // Check empty
     if (rollNumber.trim().equals("")) {

         throw new NullPointerException(
                 "Roll number cannot be empty."
         );
     }


     // Find student
     Student student = findStudent(rollNumber);


     // Successful selection
     student.selected = true;

     currentStudent = student;


     System.out.println();
     System.out.println("STUDENT SELECTED");
     System.out.println(
             "Welcome " + student.getName()
     );
 }


 // =================================================
 // ENTER MARKS
 // =================================================

 public void enterMarks(int[] marks)
         throws InvalidMarksException {

     if (currentStudent == null) {

         System.out.println(
                 "Please select a student first."
         );

         return;
     }


     currentStudent.setMarks(marks);


     System.out.println();
     System.out.println(
             "Marks saved successfully."
     );
 }


 // =================================================
 // GENERATE RESULT
 // =================================================

 public void generateResult()
         throws FailException {

     if (currentStudent == null) {

         System.out.println(
                 "Please select a student first."
         );

         return;
     }


     // May throw NullPointerException / ArithmeticException
     double percentage =
             currentStudent.calculatePercentage();


     int[] marks = currentStudent.getMarks();


     System.out.println();
     System.out.println("========== RESULT ==========");
     System.out.println("Roll Number : "
             + currentStudent.getRollNumber());
     System.out.println("Name        : "
             + currentStudent.getName());
     System.out.println();


     for (int i = 0; i < marks.length; i++) {

         System.out.printf(
                 "%-12s: %d%n", Student.SUBJECTS[i], marks[i]
         );
     }


     System.out.println();
     System.out.println("Total       : "
             + currentStudent.getTotal()
             + " / " + Student.MAX_TOTAL);

     System.out.printf("Percentage  : %.2f%%%n", percentage);


     // May throw FailException
     currentStudent.checkPass();


     // Reached only if the student passed every subject
     System.out.println("Result      : PASS");
     System.out.println("Grade       : "
             + currentStudent.getGrade(percentage));
 }


 // =================================================
 // ADD NEW STUDENT
 // =================================================

 public void addNewStudent(Scanner sc)
         throws InvalidStudentException {


     System.out.println();
     System.out.println("========== ADD NEW STUDENT ==========");


     // Roll number
     System.out.print("Enter Roll Number: ");
     String rollNumber = sc.nextLine();


     if (rollNumber.trim().equals("")) {

         throw new InvalidStudentException(
                 "Roll number cannot be empty."
         );
     }


     // Duplicate roll number check
     for (int i = 0; i < studentCount; i++) {

         if (students[i].getRollNumber()
                 .equals(rollNumber)) {

             throw new InvalidStudentException(
                     "Roll number already exists."
             );
         }
     }


     // Name
     System.out.print("Enter Student Name: ");
     String name = sc.nextLine();


     // Select student type
     System.out.println();
     System.out.println("Select Student Type");
     System.out.println("1. Hostel Student");
     System.out.println("2. Day Scholar");

     System.out.print("Enter your choice: ");

     int type = Integer.parseInt(
             sc.nextLine()
     );


     // Create Hostel Student
     if (type == 1) {

         System.out.print("Enter Hostel Name: ");
         String hostelName = sc.nextLine();


         HostelStudent student = new HostelStudent(
                 rollNumber,
                 name,
                 hostelName
         );


         addStudent(student);


         System.out.println(
                 "New Hostel Student added successfully."
         );
     }


     // Create Day Scholar
     else if (type == 2) {

         System.out.print("Enter City: ");
         String city = sc.nextLine();


         DayScholar student = new DayScholar(
                 rollNumber,
                 name,
                 city
         );


         addStudent(student);


         System.out.println(
                 "New Day Scholar added successfully."
         );
     }


     else {

         System.out.println(
                 "Invalid student type."
         );
     }
 }


 // =================================================
 // STUDENT DETAILS
 // =================================================

 public void displayStudentDetails() {

     if (currentStudent == null) {

         System.out.println(
                 "Please select a student first."
         );

         return;
     }


     System.out.println();
     System.out.println("========== STUDENT DETAILS ==========");


     currentStudent.displayStudent(true);


     // Hostel student
     if (currentStudent instanceof HostelStudent) {

         HostelStudent hostel =
                 (HostelStudent) currentStudent;

         hostel.hostelDetails();
     }


     // Day scholar
     else if (currentStudent instanceof DayScholar) {

         DayScholar day =
                 (DayScholar) currentStudent;

         day.dayScholarDetails();
     }
 }


 // =================================================
 // DISPLAY ALL STUDENTS
 // =================================================

 public void displayAllStudents() {

     System.out.println();
     System.out.println(
             "========== REGISTERED STUDENTS =========="
     );


     if (studentCount == 0) {

         System.out.println(
                 "No students registered."
         );

         return;
     }


     for (int i = 0; i < studentCount; i++) {

         System.out.println();

         System.out.println(
                 "Student " + (i + 1)
         );


         students[i].displayStudent(true);


         if (students[i] instanceof HostelStudent) {

             HostelStudent hostel =
                     (HostelStudent) students[i];

             hostel.hostelDetails();
         }


         else if (students[i] instanceof DayScholar) {

             DayScholar day =
                     (DayScholar) students[i];

             day.dayScholarDetails();
         }
     }
 }


 // =================================================
 // DESELECT STUDENT
 // =================================================

 public void deselectStudent() {

     if (currentStudent != null) {

         currentStudent.selected = false;

         System.out.println(
                 "Student deselected successfully."
         );

         currentStudent = null;

     } else {

         System.out.println(
                 "No student is currently selected."
         );
     }
 }
}


//=====================================================
//MAIN CLASS
//=====================================================

public class StudentResult {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);


     // Create result system
     ResultSystem system = new ResultSystem(20);


     // =================================================
     // DEFAULT STUDENT 1
     // =================================================

     HostelStudent student1 =
             new HostelStudent(
                     "101",
                     "Arun",
                     "Green Hostel"
             );


     // =================================================
     // DEFAULT STUDENT 2
     // =================================================

     DayScholar student2 =
             new DayScholar(
                     "102",
                     "Priya",
                     "Madurai"
             );


     // =================================================
     // DEFAULT STUDENT 3
     // =================================================

     HostelStudent student3 =
             new HostelStudent(
                     "103",
                     "Kumar",
                     "Blue Hostel"
             );


     // Add default students
     // No message will be printed here

     system.addStudent(student1);
     system.addStudent(student2);
     system.addStudent(student3);


     int choice = 0;


     // =================================================
     // MAIN MENU
     // =================================================

     do {

         System.out.println();

         System.out.println(
                 "========== STUDENT RESULT SYSTEM =========="
         );

         System.out.println("1. Select Student");
         System.out.println("2. Enter Marks");
         System.out.println("3. Show Result");
         System.out.println("4. Add New Student");
         System.out.println("5. Student Details");
         System.out.println("6. Display All Students");
         System.out.println("7. Deselect Student");
         System.out.println("8. Exit");


         System.out.print(
                 "\nEnter your choice: "
         );


         try {

             choice = Integer.parseInt(
                     sc.nextLine()
             );


             // =================================================
             // 1. SELECT STUDENT
             // =================================================

             if (choice == 1) {

                 System.out.print(
                         "Enter roll number: "
                 );

                 String rollNumber =
                         sc.nextLine();


                 try {

                     system.selectStudent(rollNumber);
                 }


                 catch (InvalidStudentException e) {

                     System.out.println(
                             "\nSTUDENT ERROR: "
                             + e.getMessage()
                     );
                 }


                 catch (NullPointerException e) {

                     System.out.println(
                             "\nNULL ERROR: "
                             + e.getMessage()
                     );
                 }


                 finally {

                     System.out.println(
                             "Student selection completed."
                     );
                 }
             }


             // =================================================
             // 2. ENTER MARKS
             // =================================================

             else if (choice == 2) {

                 if (!system.hasSelectedStudent()) {

                     System.out.println(
                             "Please select a student first."
                     );
                 }


                 else {

                     int[] marks =
                             new int[Student.SUBJECTS.length];


                     try {

                         for (int i = 0;
                              i < Student.SUBJECTS.length;
                              i++) {

                             System.out.print(
                                     "Enter marks for "
                                     + Student.SUBJECTS[i]
                                     + " (0-100): "
                             );

                             marks[i] = Integer.parseInt(
                                     sc.nextLine()
                             );
                         }


                         system.enterMarks(marks);
                     }


                     catch (InvalidMarksException e) {

                         System.out.println(
                                 "\nMARKS ERROR: "
                                 + e.getMessage()
                         );
                     }


                     catch (NumberFormatException e) {

                         System.out.println(
                                 "\nPlease enter valid numeric marks."
                         );
                     }


                     catch (NullPointerException e) {

                         System.out.println(
                                 "\nNULL ERROR: "
                                 + e.getMessage()
                         );
                     }


                     finally {

                         System.out.println(
                                 "Marks entry process completed."
                         );
                     }
                 }
             }


             // =================================================
             // 3. SHOW RESULT
             // =================================================

             else if (choice == 3) {

                 try {

                     system.generateResult();
                 }


                 catch (FailException e) {

                     System.out.println(
                             "Result      : FAIL"
                     );

                     System.out.println(
                             "\nFAIL ERROR: "
                             + e.getMessage()
                     );
                 }


                 catch (NullPointerException e) {

                     System.out.println(
                             "\nNULL ERROR: "
                             + e.getMessage()
                     );
                 }


                 catch (ArithmeticException e) {

                     System.out.println(
                             "\nARITHMETIC ERROR: "
                             + e.getMessage()
                     );
                 }


                 finally {

                     System.out.println(
                             "Result process completed."
                     );
                 }
             }


             // =================================================
             // 4. ADD NEW STUDENT
             // =================================================

             else if (choice == 4) {

                 try {

                     system.addNewStudent(sc);
                 }


                 catch (InvalidStudentException e) {

                     System.out.println(
                             "STUDENT ERROR: "
                             + e.getMessage()
                     );
                 }


                 catch (NumberFormatException e) {

                     System.out.println(
                             "Please enter valid numeric values."
                     );
                 }


                 finally {

                     System.out.println(
                             "Student registration process completed."
                     );
                 }
             }


             // =================================================
             // 5. STUDENT DETAILS
             // =================================================

             else if (choice == 5) {

                 system.displayStudentDetails();
             }


             // =================================================
             // 6. DISPLAY ALL STUDENTS
             // =================================================

             else if (choice == 6) {

                 system.displayAllStudents();
             }


             // =================================================
             // 7. DESELECT STUDENT
             // =================================================

             else if (choice == 7) {

                 system.deselectStudent();
             }


             // =================================================
             // 8. EXIT
             // =================================================

             else if (choice == 8) {

                 System.out.println();
                 System.out.println(
                         "Thank you for using the system."
                 );
             }


             else {

                 System.out.println(
                         "Invalid menu choice."
                 );
             }


         }


         catch (NumberFormatException e) {

             System.out.println(
                     "Please enter a valid number."
             );
         }


     } while (choice != 8);


     sc.close();
 }
}


