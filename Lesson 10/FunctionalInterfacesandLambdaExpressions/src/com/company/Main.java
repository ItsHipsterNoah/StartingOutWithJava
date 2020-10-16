package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);

	    // Implements calc()
	    IntCalculator square = x -> x * x;

	    System.out.print("Enter an integer number: ");
	    int num = keyboard.nextInt();

	    System.out.println("The square is " + square.calc(num));
    }
}
