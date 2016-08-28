/* HackerRank Day 15 - Matt Jass

Link: TODO add link here

Objective:
Today we're discussing scope.
Check out the Tutorial tab for learning materials and an instructional video!

The absolute difference between two integers, a and b, is written as |a-b|.
The maximum absolute difference between two integers in a set of positive integers, elements,
is the largest absolute difference between any two integers in elements.

The Difference class is started for you in the editor. It has a private integer array (elements)
for storing N non-negative integers, and a public integer (maximumDifference) for storing the maximum absolute difference.

Task:
Complete the Difference class by writing the following:

    -A class constructor that takes an array of integers as a parameter and saves it to the elements instance variable.
    -A computeDifference method that finds the maximum absolute difference between any 2 numbers in N
     and stores it in the maximumDifference instance variable.

Input Format:
You are not responsible for reading any input from stdin.
The locked Solution class in your editor reads in 2 lines of input; the first line contains N,
and the second line describes the elements array.

Constraints:
1 <= N <= 10
1 <= elements[i] <= 100, where 0 <= i <= N-1

Output Format:
You are not responsible for printing any output;
the Solution class will print the value of the maximumDifference instance variable.

 */

import java.util.Scanner;

import static java.lang.StrictMath.abs;

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] inputArray) {
        elements = inputArray;
    } // end Difference Constructor

    int computeDifference() {
        int currentDifference;

        for (int i = 0; i < elements.length; i++) {

            for (int j = i + 1; j < elements.length; j++) {
                currentDifference = abs(elements[i]  - elements[j]);

                if (currentDifference > maximumDifference) {
                    maximumDifference = currentDifference;
                } // end if

            } // end for (i)

        } // end for (j)

        return maximumDifference;

    } // end compute Difference

} // end Difference

public class Day14Scope {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        } // end for

        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);

    } // end main

} //end Day15 Scope
