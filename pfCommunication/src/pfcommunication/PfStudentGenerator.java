package pfcommunication;

/// This program allows a user to create new instances of the student class
//each new student is entered into a an array (list) of 10 students total
// the program prints the list once the user has filled all 10 students into the array
import java.util.Scanner;

public class PfStudentGenerator {

    public static void main(String[] args) {
// scanner for user input
        Scanner scan = new Scanner(System.in);

// creates new array of student objects
        Student[] students = new Student[10];
// loop that allows the user to create new steudents one at a time
        int count = 0;
        for (int i = 0; i < students.length; i++) {

            System.out.println("Enter student name: ");
            String name = scan.next();

            System.out.println("Enter student grade level: ");
            String status = scan.next();

            System.out.println("Enter student GPA: ");
            double GPA = scan.nextDouble();

            Student student = new Student(name, status, GPA);

            students[i] = student;

            count++;

        }
// loop that prints the list of created students to the console
        for (int i = 0; i < students.length; i++) {

            System.out.println("Name: " + students[i].getStrName());
            System.out.println("Year: " + students[i].getStrStatus());
            System.out.println("GPA: " + students[i].getDblGPA());

        }

    }// END OF DRIVER METHOD, main().

}// END OF CLASS
