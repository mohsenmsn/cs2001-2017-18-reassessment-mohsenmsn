package com.example.mohen.mpg_calc;

import java.util.Scanner;

public class Mile {
    public static void main(String[] args) {
        Mile mileage2 = new Mile();

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the MPG calculator!");
        double TextEdit2;
        double TextEdit3;
        double mpg;
        double average;

        String repeat = "yes";

        while (repeat.equalsIgnoreCase("YES")) {
            Mile mileage1 = new Mile();
            System.out.println("Enter miles driven: ");
            TextEdit2 = input.nextDouble();
            mileage1.setMilesDriven(TextEdit2);
            mileage2.setMilesDriven(TextEdit2);

            System.out.println("Enter litres used: ");
            TextEdit3 = input.nextDouble();
            mileage1.setGallonsUsed(TextEdit3);
            mileage2.setGallonsUsed(TextEdit3);

            mpg = mileage1.getMpg();
            System.out.println("Your mpg is: " + mpg);

            System.out.println("go next ");
            repeat = input.next();

        }

        average = mileage2.getMpg();
        System.out.println("Your total average mpg is: " + average);
    }

    double milesDriven;
    double litresUsed;
    double mpg1;

    public void setMilesDriven(double Miles) {
        milesDriven = milesDriven + Miles;
    }

    public void setGallonsUsed(double litres) {
        litresUsed = litresUsed + litres;
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public double getGallonsUSed() {
        return litresUsed;
    }

    public double getMpg() {
        return milesDriven / litresUsed;
    }

}
