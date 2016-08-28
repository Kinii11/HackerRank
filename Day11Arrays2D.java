/* HackerRank Day 11 - Matt Jass

Link: https://www.hackerrank.com/challenges/30-2d-arrays

Objective:
Today, we're building on our knowledge of Arrays by adding another dimension.
Check out the Tutorial tab for learning materials and an instructional video!

Context
Given a 6x6  2D Array, A:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

We define an hourglass in A to be a subset of values with indices falling in this pattern
in A's graphical representation:

a b c
  d
e f g

There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.

Task:
Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

Input Format:
There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A;
every value in A will be in the inclusive range of -9 to 9.

Constraints:
-9 <= A[i][j] <= 9
0 <= i, j <= 5

Output Format:
Print the largest (maximum) hourglass sum found in A.

 */

import java.util.Scanner;

public class Day11Arrays2D {

    private static int iterations = 6; // Number of lines of input

    private static Integer[][] userArray= new Integer[iterations][iterations];

    //Given the upper left corner of an hourglass, sum it's components
    private static int sumHourglass(int one, int two) {

        int sum = userArray[one][two]  + userArray[one][two+1]   + userArray[one][two+2]
                                       + userArray[one+1][two+1]
               + userArray[one+2][two] + userArray[one+2][two+1] + userArray[one+2][two+2];

        return sum;
    } // end sumHourglass

    private static void displayArray(Integer[][] arrayToDisplay) {

        System.out.println();

        for (int i = 0; i < arrayToDisplay.length; i++) {

            for (int j = 0; j < arrayToDisplay.length; j++) {
                System.out.print(userArray[i][j] + " ");
            } // end for (j)

            System.out.println();

        } // end for (i)

    } // end displayArray

    public static void main (String[] args) {

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Place input into Array (userArray)
        for (int i = 0; i < iterations; i++) {

            for (int j = 0; j < iterations; j++) {
                userArray[i][j] = keyboard.nextInt();
            } // end for (j)

        } // end for (i)

        keyboard.close();  // Close scanner

        // Display array
        // displayArray(userArray); // Comment out for submission

        // Calculate maximum sum
        int maximumSum = 0;
        for (int i = 0; i < iterations - 2; i++) {

            for (int j = 0; j < iterations - 2; j++) {

                int temporarySum = sumHourglass(i, j);
                if (temporarySum > maximumSum) {
                    maximumSum = temporarySum;
                } // end if
            } // end for (j)

        } // end for (i)

        // System.out.print("Maximum Sum = "); // Comment out for submission
        System.out.println(maximumSum);

    } // end main

} // end Day11Arrays2D
