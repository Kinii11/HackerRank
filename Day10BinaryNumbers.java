/* HackerRank Day 10 - Matt Jass

Link: https://www.hackerrank.com/challenges/30-binary-numbers

Objective:
Today, we're working with binary numbers.
Check out the Tutorial tab for learning materials and an instructional video!

Task:
Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the
maximum number of consecutive 1's in n's binary representation.

Input Format:
A single integer, n.

Constraints:
1 <= n <= 10^6

Output Format
Print a single base-10 integer denoting the maximum number of consecutive 1's in the binary representation of n.

 */


import java.util.Scanner;

public class Day10BinaryNumbers {

    public static void main (String[] args) {

        // Get input from user
        Scanner keyboard = new Scanner(System.in);
        // System.out.print("Enter an Integer to Convert: ");
        int inputNumber = keyboard.nextInt();
        keyboard.close();

        // Convert to Binary
        String binaryNumberString = Integer.toBinaryString(inputNumber).toString();

        // Calculate Maximum number of ones in a row
        int maxNumberOfOnes = 0, currentNumber = 0;
        for (int i = 0; i < binaryNumberString.length(); i++) {

            if (binaryNumberString.equals("1")) {
                currentNumber++;
            } // end if
            if (currentNumber > maxNumberOfOnes) {
                maxNumberOfOnes = currentNumber;
                currentNumber = 0;
            } // end if

        } // end for
        // Print output
        // System.out.print("Max number = ");
        System.out.println(maxNumberOfOnes);
    } // end main

} // end Day10BinaryNumbers
