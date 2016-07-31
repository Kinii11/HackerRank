/* Hacker Rank: Day 6 - Matt Jass

Link: https://www.hackerrank.com/challenges/30-review-loop

Objective:
Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops.
Check out the Tutorial tab for learning materials and an instructional video!

Task
Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as
2 space-separated strings on a single line (see the Sample below for more detail).

Sample Input:
2
Hacker
Rank

Sample Output:
Hce akr
Rn ak

Note: 0 is considered to be an even index.


Input Format:
The first line contains an integer, T (the number of test cases).
Each line i of the T subsequent lines contain a String, S.

Constraints:
1 <= T <= 10
2 <= length of S <= 10000

Output Format

For each String Sj (where 0 <= j <= T-1), print Sj's even-indexed characters, followed by a space,
followed by Sj's odd-indexed characters.

Note: The name of the class must be Solution when submitted
 */

import java.util.Scanner;

public class Day06LetsReview {

    public class Solution {
        // Must be named Solution when submitted.
    } // end Solution

    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);
//        System.out.println("How many test cases: "); // Needed to comment out for submission
        int testCases = keyboard.nextInt();


        for (int counter = 0; counter < testCases; counter++) {
            char[] output = keyboard.next().toCharArray();

            String odd = "", even = "";
            for (int counter2 = 0; counter2 < output.length; counter2++) {
                if (counter2%2 == 0) {
                    even = even + output[counter2];
                } // end if
                else {
                    odd = odd + output[counter2];
                } // end else
            } // end for

            System.out.println(even + " " + odd);

        } // end for

        keyboard.close();

    } // end main
} // end Day06LetsReview
