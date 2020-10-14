package com.company;

public class Main {

    public static void displayMessage() {
        System.out.println("Hello, world!");
    }

    public static void main(String[] args) {
	    displayMessage();
	    showSum(5, 10);
	    System.out.println(sum(5,5));
    }

    /**
     *  Displays the sum of two numbers
     * @param num1 The first number
     * @param num2 The second number
     */
    public static void showSum(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    /**
     *  Displays the sum of two numbers.
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The sum of num1 and num2.
     */
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
}

/**
 *  General notes
 *  -------------
 *
 *  Arguments in Java are passed by value
 *
 *  However, when objects are passed, they are passed by
 *  reference. The only exception to this is that
 *  Strings are immutable, so they cannot be changed.
 *
 *  @param allows you to describe parameters; must appear after
 *  general description of the message.
 *
 *  @return allows you to describe the method's return
 */
