/* Hacker Rank: Day 02 - Matt Jass

Link: https://www.hackerrank.com/challenges/30-operators

Objective:
In this challenge, you'll work with arithmetic operators.
Check out the Tutorial tab for learning materials and an instructional video!

Task:
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip),
and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!

Input Format:
There are  lines of numeric input:
    The first line has a double,  (the cost of the meal before tax and tip).
    The second line has an integer,  (the percentage of  being added as tip).
    The third line has an integer,  (the percentage of  being added as tax).

Output Format:
Print , where  is the rounded integer result of the entire bill ( with added tax and tip).

 */

import java.util.Scanner;

public class Day02Operators {

    public static void main(String[] args) {

        System.out.println("Meal Calculator");
        Scanner scan = new Scanner(System.in);


        System.out.print("Original Meal Price: ");
        double mealCost = scan.nextDouble(); // original meal price
        System.out.println();

        System.out.print("Tip Percentage: ");
        int tipPercent = scan.nextInt(); // tip percentage
        System.out.println();

        System.out.print("Tax percentage: ");
        int taxPercent = scan.nextInt(); // tax percentage
        System.out.println();

        scan.close();

        // Calculations
        double tip = (double)tipPercent * mealCost / 100;
        double tax = (double)taxPercent * mealCost / 100;

        // Cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost+tip+tax);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");

    } // end main

} // Day02Operators
