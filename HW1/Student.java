/*
 * Name: Lena Hamilton
 * CS2050 - Computer Science II - Summer 2021
 * Instructor: Thyago Mota
 * Description: Hwk 01 - Student
 * Date June 7, 2021
 */
package Homework.HW1;

public class Student {

    // #1: define 3 instance variables to hold id, name, and major
    public String idNumber;
    public String name;
    public String major;

    final String default_major = "undeclared";

    public Student(String idNumber, String name, String major) {
        // #2: write a constructor with all 3 parameters
        this.idNumber = idNumber;
        this.name = name;
        this.major = major;

    }

    public Student(String idNumber, String name) {
        // #3: write a constructor with only the student's id and name (in that case, major should be set to "undeclared")
        this.idNumber = idNumber;
        this.name = name;
        this.major = default_major;

    }

    // #4: write a method called getMajor that returns the major of the student
    public String getMajor() {
        return major;
    }
 
}