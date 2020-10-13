package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); int age;
        System.out.print("How old are you? ");
        age = keyboard.nextInt();

	    if (age >= 18) {
	        System.out.println("You're an adult!");
	        if (age >= 65) {
	            System.out.println("And not just an adult! You are also a senior citizen. :)");
            }
        }
	    else if (age < 0) {
	        System.out.println("Sorry! That's not a valid age.");
        }
	    else {
	        System.out.println("You're not an adult yet, you still have " + (18 - age) + " years to go!");
        }
	    // Java Logical Operators (ordered by precedence):

        // !  - NOT
        // && - AND
        // || - OR

    }
}
