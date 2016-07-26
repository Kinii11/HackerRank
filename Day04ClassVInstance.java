/* Hacker Rank: Day 4 - Matt Jass

Link: https://www.hackerrank.com/challenges/30-class-vs-instance?h_r=next-challenge&h_v=zen

Objective:
In this challenge, we're going to learn about the difference between a class and an instance;
because this is an Object Oriented concept, it's only enabled in certain languages.
Check out the Tutorial tab for learning materials and an instructional video!

Task:
Write a Person class with an instance variable, age, and a constructor that takes an integer, initialAge, as a parameter.
The constructor must assign  to  after confirming the argument passed as  is not negative;
if a negative argument is passed as initialAge, the constructor should set age to 0
and print "Age is not valid, setting age to 0."

In addition, you must write the following instance methods:
    yearPasses() should increases the age instance variable by 1.
    amIOld() should perform the following conditional actions:
        If age < 13, print "You are young."
        If age >= 13 and age < 18, print "You are a teenager."
        Otherwise, print "You are old."

To help you learn by example and complete this challenge, much of the code is provided for you,
but you'll be writing everything in the future. The code that creates each instance of your Person class is in
the main method. Don't worry if you don't understand it all quite yet!

Note: Do not remove or alter the stub code in the editor.

Input Format:
Input is handled for you by the stub code in the editor.

The first line contains an integer, T (the number of test cases), and the T subsequent lines each
contain an integer denoting the age of a Person instance.

Constraints:
1 <= T <= 4
-5 <= age <= 30

Output Format:
Complete the method definitions provided in the editor so they meet the specifications outlined above;
the code to test your work is already in the editor. If your methods are implemented correctly,
each test case will print 2 or 3 lines (depending on whether or not a valid initialAge was passed to the constructor).

 */

import java.util.Scanner;

public class Day04ClassVInstance {

    public static class Person {

        private int age;

        public Person (int initialAge) {
            if (initialAge < 0) {
                age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            } // end if
            else {
                age = initialAge;
            } // end else

        } // end Person

        public void amIOld() {
            if (age < 13) {
                System.out.println("You are young.");
            } // end if
            else if (age >= 13 && age < 18) {
                System.out.println("You are a teenager.");
            } // end else if
            else {
                System.out.println("You are old.");
            }
        } // end amIOld

        public void yearPasses() {
            age = age + 1;
        } // end yearPasses
    } // end Person

    public static void main (String[] args) {
        int T = 4; // Number of Iterations
        int[] inputs = {-1, 10, 16,18};

        for (int i = 0; i < T; i++) {
            int age = inputs[i];
            Person p= new Person(age);
            p.amIOld();

            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            } // end for

            p.amIOld();
            System.out.println();
        } // end for
    } // end main
} // end Day04
