package com.company;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException {
		// Creating a new file and writing to it
		String filename, input;
		filename = JOptionPane.showInputDialog("Enter the filename:");
		PrintWriter outputFile = new PrintWriter(filename);
		input = JOptionPane.showInputDialog("Enter data to write to file:");
		outputFile.println(input);

		// Appending to an existing file
		FileWriter fwriter = new FileWriter("MyFriends.txt", true);
		PrintWriter appendFile = new PrintWriter(fwriter);
		appendFile.println("Jonathan");
		appendFile.println("Josh");
		appendFile.println("Peyton");

		// Reading data from a file
		File myFile = new File("MyFriends.txt");
		Scanner readFile = new Scanner(myFile);
		while (readFile.hasNext()) {
			System.out.println(readFile.nextLine());
		}

		// Reading Numbers
		double sum = 0.0;
		File numFile = new File("Numbers.txt");
		if (!numFile.exists()) {
			System.out.println("File does not exist. Program exiting.");
			System.exit(0);
		}
		Scanner inputNumFile = new Scanner(numFile);
		while(inputNumFile.hasNext()) {
			sum += inputNumFile.nextDouble();
		}
		System.out.println("The sum of the numbers is: " + sum);

		// Closing up files. Files must be closed in order to write data
		outputFile.close();
		appendFile.close();
		readFile.close();
		inputNumFile.close();
	}
}