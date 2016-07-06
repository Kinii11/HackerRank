/* Hacker Rank: Day 0 - Matt Jass

Link: https://www.hackerrank.com/challenges/30-hello-world

Objective:
In this challenge, we review some basic concepts that will get you started with this series.
Check out the Tutorial tab for learning materials and an instructional video!

Task:
To complete this challenge, you must save a line of input from stdin to a variable,
print  on a single line, and finally print the value of your variable on a second line.

You've got this!

Note: The instructions are Java-based, but we support submissions in many popular languages.
You can switch languages using the drop-down menu above your editor.

Input Format:
A single line of text denoting  (the variable whose contents must be printed).

Output Format:
Print  on the first line, and the contents of  on the second line.

 */

import java.util.*;

public class Day00HelloWorld {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // use the Scanner class to read from stdin
        System.out.print("Please insert your text to be copied: ");
        String inputString = scan.nextLine(); // read a line of input and save it to a variable
        System.out.println(); // Blank line
        scan.close(); // close the scanner

        // Your first line of output goes here
        System.out.println("Hello, World.");

        // Write the second line of output
        System.out.println(inputString);
    } // end main

} // end Day00
