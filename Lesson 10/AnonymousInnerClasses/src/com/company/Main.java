package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    IntCalculator square = new IntCalculator() {
            @Override
            public int calc(int number) {
                return number * number;
            }
        };
	    Scanner keyboard = new Scanner(System.in);
	    System.out.print("Enter an integer number:");
	    int number = keyboard.nextInt();

	    System.out.println("The square of " + number +" is " +square.calc(number));

	    

    }
}
