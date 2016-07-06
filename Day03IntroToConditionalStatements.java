/* Hacker Rank: Day 03 - Matt Jass

Link: https://www.hackerrank.com/challenges/30-conditional-statements

Objective:
In this challenge, we're getting started with conditional statements. Check out the Tutorial tab for learning materials and an instructional video!

Task:
Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format:
A single line containing a positive integer, .

Constraints:
1 <= n <= 100

Output Format:

Print Weird if the number is weird; otherwise, print Not Weird.
 */

import java.util.Scanner;

public class Day03IntroToConditionalStatements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        if ((n < 1) || (n > 100)) {
            ans = "Out Of Range";
        }
        else {
            // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
            if(n%2==1){
                ans = "Weird";
            } // end if
            else {
                if ((2 <= n) && (n <=5) ) {
                    ans = "Not Weird";
                } // end if
                else if ((6 <= n) && (n <= 20)) {
                    ans = "Weird";
                } // end else if
                else if (20 < n) {
                    ans = "Not Weird";
                } // end else if
            } // end else
        } // end else
        System.out.println(ans);
    } // end main

} // end Day 03
