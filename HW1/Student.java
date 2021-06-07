/*
 * Name: Lena Hamilton
 * CS2050 - Computer Science II - Summer 2021
 * Instructor: Thyago Mota
 * Description: Hwk 01 - Student
 * Date June 7, 2021
 */

public class Student {

    // TODO #1: define 3 instance variables to hold id, name, and major
    public String idNumber;
    public String name;
    public String major;

    public Student(String idNumber, String name, String major) {
        // TODO #2: write a constructor with all 3 parameters
        idNumber = "9000000001";
        name = "Jane Doe";
        major = "political science";

    }

    public Student(String idNumber, String name) {
        // TODO #3: write a constructor with only the student's id and name (in that case, major should be set to "undeclared")
        idNumber = "90000000002";
        name = "John Doe";

    }

    // TODO #4: write a method called getMajor that returns the major of the student
    public String getMajor() {
        return major;
    }

    public static void main(String[] args) {

        
    }
 
}