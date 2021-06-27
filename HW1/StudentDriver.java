/*
 * Name: Lena Hamilton
 * CS2050 - Computer Science II - Summer 2021
 * Instructor: Thyago Mota
 * Description: Hwk 01 - StudentDriver
 * Date: June 7, 2021
 */
package Homework.HW1;

public class StudentDriver {

    public static void main(String[] args) {

        // TODO #5: instantiate a student object
        Student sA = new Student("9000000003", "Bob Somebody", "Nursing");

        // TODO #6: display the student's major
        System.out.println("Major:" +  sA.getMajor() );
    }
}