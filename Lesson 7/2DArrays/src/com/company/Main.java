package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int students, tests; Scanner keyboard = new Scanner(System.in);
        System.out.print("How many students are there? ");
        students = keyboard.nextInt();
        System.out.print("How many tests are there? ");
        tests = keyboard.nextInt();

        double[][] scores = new double[students][tests];

        for (int s = 0; s < scores.length; s++) {
            for (int t = 0; t < scores[s].length; t++) {
                System.out.print("Enter Student " + (s + 1) +"'s " + " test number " + (t+1) + " score: ");
                scores[s][t] = keyboard.nextDouble();
            }
        }

        for (int s = 0; s < scores.length; s++) {
            System.out.println("Student " + (s+1) + " scores:");
            System.out.println("");
            for (int t = 0; t < scores[s].length; t++) {
                System.out.println("Test" + (t+1) + "score: " + scores[s][t]);
            }
            System.out.println("");
        }

    }
}
