package pfcommunication;

public class Student {

    //This file creates the student class
    // the student has a name, grade year " status" and GPA
    private String strName;
    private String strStatus;
    private double dblGPA;
    // declaration of variables and creattion of student class

    public Student(String name, String status, double gpa) {
        // this allocator used to encapsulate private variables 
        this.strName = name;
        this.strStatus = status;
        this.dblGPA = gpa;
    }
    // creates a method that allows the user to print out the informaton of a given student

    public void printStudent() {
        System.out.println("Name: " + strName);
        System.out.println("Status: " + strStatus);
        System.out.println("GPA: " + dblGPA);
        System.out.println();
    }

    // allows setting and getting of name, status and GPA
    public String getStrName() {
        return this.strName;
    }

    public void setStrName(String name) {
        this.strName = name;
    }

    public String getStrStatus() {
        return strStatus;
    }

    public void setStrStatus(String status) {
        this.strStatus = status;
    }

    public double getDblGPA() {
        return dblGPA;
    }

    public void setDblGPA(double gpa) {
        this.dblGPA = gpa;
    }

}
