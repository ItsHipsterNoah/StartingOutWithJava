package com.company;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	    String input;
	    char ch;

	    System.out.println(Character.toLowerCase('A'));

		System.out.println(Character.toUpperCase('A'));

	    input = JOptionPane.showInputDialog("Enter any single character.");
	    ch = input.charAt(0);

	    if (Character.isLetter(ch)) {
	        JOptionPane.showMessageDialog(null, "That is a letter");

        }
		if (Character.isDigit(ch)) {
			JOptionPane.showMessageDialog(null, "That is a digit.");

		}
	    if (Character.isLowerCase(ch)) {
	        JOptionPane.showMessageDialog(null, "That is a lowercase letter.");
        }
	    if (Character.isUpperCase(ch)) {
            JOptionPane.showMessageDialog(null, "That is an uppercase letter.");
        }
	    if (Character.isSpaceChar(ch)) {
            JOptionPane.showMessageDialog(null, "That is a space.");
        }
	    if (Character.isWhitespace(ch)) {
            JOptionPane.showMessageDialog(null, "That is whitespace.");
        }
	    System.exit(0);
    }
}
