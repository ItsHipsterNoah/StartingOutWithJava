package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char grade; String input;
        Scanner keyboard = new Scanner(System.in);
	    System.out.print("What is your grade? ");
	    input = keyboard.nextLine();
	    grade = input.toUpperCase().charAt(0);
	    switch (grade) {
            case 'A':
                System.out.println("Keep up the great work!");
                break;
            case 'B':
                System.out.println("You're doing good!");
                break;
            case 'C':
                System.out.println("You're doing about average.");
                break;
            case 'D':
                System.out.println("Just a little more hard work and you'll be fine!");
                break;
            case 'F':
                System.out.println("Sorry to hear that. But I'm sure you can get your grade up!");
                break;
            default:
                System.out.println("Sorry! That's not a valid letter grade.");
                break;
        }
        // Note: As of Java 7, the test expression can be a string
    }
}
