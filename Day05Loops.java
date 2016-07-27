/* Hacker Rank: Day 5 - Matt Jass

Link: https://www.hackerrank.com/challenges/30-loops

Objective:
In this challenge, we're going to use loops to help us do some simple math.
Check out the Tutorial tab to learn more.

Task:
Given an integer, N, print its first 10 multiples. Each multiple N x i (where 1 <= i <= 10 )
should be printed on a new line in the form: N x i = result.

Input Format:
A single integer, N.

Constraints:
2 <= N <= 20

Output Format:
Print 10 lines of output; each line i (where 1 <= i <= 10) contains the result of N x i in the form:
N x i = result.

 */

import java.io.*;
import java.util.*;

public class Day05Loops {

    public class Solution {
    } // end Solution
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");

        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        keyboard.close();

        int counter = 1;

        while (counter <= 10) {
            System.out.println(n + " x " + counter + " = " + (n*counter));
            counter++;
        } // end while

    } // end main
} // end Day05Loops
