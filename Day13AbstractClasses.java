/* HackerRank Day 13 - Matt Jass

Link: TODO add link here

Objective:
Today, we're taking what we learned yesterday about Inheritance and extending it to Abstract Classes.
Because this is a very specific Object-Oriented concept, submissions are limited to the few languages that
use this construct.
Check out the Tutorial tab for learning materials and an instructional video!

Task:
Given a Book class and a Solution class, write a MyBook class that does the following:

    -Inherits from Book
    -Has a parameterized constructor taking these  parameters:
        -string Title
        -string author
        -int price
    -Implements the Book class' abstract display() method so it prints these  lines:
        - Title:, a space, and then the current instance's title.
        -Author:, a space, and then the current instance's author.
        -Price:, a space, and then the current instance's title.

Note: Because these classes are being written in the same file, you must not use an access modifier (e.g.: public)
when declaring MyBook or your code will not execute.

Input Format:
You are not responsible for reading any input from stdin.
The Solution class creates a Book object and calls the MyBook class constructor (passing it the necessary arguments).
It then calls the display method on the Book object.


Output Format:
The void display() method should print and label the respective title, author, and price of the MyBook object's instance
(with each value on its own line) like so:

    Title: $title
    Author: $author
    Price: $price

    Note: The $ is prepended to variable names to indicate they are placeholders for variables.
 */

import java.util.Scanner;

abstract class Book {
    String title;
    String author;

    Book(String t,String a) {
        title=t;
        author=a;
    } // end Book

    abstract void display();

} // end Book

class MyBook extends Book {

    int price;

    MyBook(String inputTitle, String inputAuthor, int inputPrice) {
        super(inputTitle, inputAuthor);
        price = inputPrice;

    } // end MyBook Constructor

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    } // end display


} // end MyBook Class

public class Day13AbstractClasses {

    public static void main(String []args) {
        // Handles Input from user
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();

        // Calls MyBook constructor
        Book new_novel=new MyBook(title,author,price);
        new_novel.display();

    } // end main

} // end Day13AbstractClasses
