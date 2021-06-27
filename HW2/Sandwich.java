package Homework.HW2;
/*
 * Name: Lena Hamilton
 * CS2050 - Computer Science II - Summer 2021
 * Instructor: Thyago Mota
 * Description: Hwk 02 - Sandwich
 * Date June 9, 2021
 */

import java.util.Scanner;

public class Sandwich {
    public String name;
    public int numberOfCalories;
    public double price;
    static final int calorieLimit = 250;

    public Sandwich(String name, int numberOfCalories, double price) {
        this.name = name;
        this.numberOfCalories = numberOfCalories;
        this.price = price;
    }

    boolean isHealthy(int numberOfCalories) {
        if (numberOfCalories < 250) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        if (numberOfCalories < 0) {
            numberOfCalories = 0;
        }
        if (price < 0.0) {
            price = 0.0;
        }
        return "Your sandwich: name: " + name + ", number of calories: " + numberOfCalories + ", price:" + price
                + ", healthy?: " + isHealthy(numberOfCalories);
    }

    public static void main(String[] args) {

        Scanner scanSandwich = new Scanner(System.in);
        System.out.print("Enter Sandwich Name : ");

        String name = scanSandwich.nextLine();
        System.out.print("Enter numberOfCalories : ");

        int numberOfCalories = Integer.parseInt(scanSandwich.nextLine());
        System.out.print("Enter price : ");

        double price = Double.parseDouble(scanSandwich.nextLine());

        Sandwich sandwich = new Sandwich(name, numberOfCalories, price);

        System.out.println(sandwich);
    }
}