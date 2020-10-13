package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name; int age; String input;
	    Scanner keyboard = new Scanner(System.in);

	    System.out.print("Enter your name: ");
	    name = keyboard.nextLine();
	    System.out.println("Hello there, " + name + "!");

	    System.out.print("How old are you? ");
	    age = keyboard.nextInt();

	    System.out.println("You were born in " + (2020 - age) + "!");

	    // Consume the remaining newline
        keyboard.nextLine();

        System.out.print("Are you having fun? (Y=yes, N=no) ");
        input = keyboard.nextLine();   // Get a line of input.
        char answer = input.charAt(0);      // Get the first character.
	    System.out.print("You answered " + answer + ".");
    }
}
