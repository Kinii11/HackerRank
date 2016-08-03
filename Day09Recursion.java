/* Hacker Rank: Day 9 - Matt Jass

Link: https://www.hackerrank.com/challenges/30-recursion

Objective:
Today, we're learning and practicing an algorithmic concept called Recursion.
Check out the Tutorial tab for learning materials and an instructional video!

Task:
Write a factorial function that takes a positive integer, N as a parameter and prints the result of N! (N factorial).

Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial,
you will get a score of 0.

Input Format:
A single integer, N (the argument to pass to factorial).

Constraints:
2 <= N <= 12

Your submission must contain a recursive function named factorial.

Output Format:
Print a single integer denoting N!.

 */

import java.util.Scanner;

public class Day09Recursion {

    private int total = 1;

    private int factorial(int n) {

        if (n ==1) {
            return total;
        } // end if
        else {
            total = n * total;
            return factorial(n - 1);
        } // end else

    } //  end factorial

    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        keyboard.close();

        Day09Recursion test = new Day09Recursion();
        System.out.println(test.factorial(input));

    } // end main

} // end Day09Recursion
