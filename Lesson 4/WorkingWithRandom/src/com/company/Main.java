package com.company;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int guess; int guesses = 0; String filename = "HighScore.txt";

        Scanner keyboard = new Scanner(System.in);

        Random randomNumbers = new Random();

        FileWriter outputFile = new FileWriter(filename, true);

        File file = new File(filename);

        Scanner inputFile = new Scanner(file);

        int number = randomNumbers.nextInt(100) + 1;
        System.out.println(number);
        do {
            System.out.print("Guess a random number between 1 and 100: ");
            guess = keyboard.nextInt();
            if (guess < number) {
                System.out.println("Too low! Try again!");
                guesses++;
            }
            else if (guess > number) {
                System.out.println("Too high! Try again.");
                guesses++;
            }
            System.out.println("You have made " + guesses + " guesses so far.");
        }
        while(guess != number);

        System.out.println("Congrats, you won!");

        if (file.length() == 0) {
            outputFile.write(Integer.toString(guesses));
            System.out.println("New high score!");
            outputFile.close();
        }
        else {
            int highScore = Integer.parseInt(inputFile.nextLine());
            if (guesses < highScore) {
                PrintWriter pw = new PrintWriter(filename);
                outputFile.write(Integer.toString(guesses));
                System.out.println("New high score! Way to go!");
                outputFile.close();
            }
            else {
                System.out.println("High score to beat: " + highScore);
                outputFile.close();
            }
        }

    }
}