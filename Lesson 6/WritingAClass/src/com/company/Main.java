package com.company;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
/*
	    Rectangle box = new Rectangle(10, 10);

	    // Rectangle box; <-- Don't do this! Object variables must be initialized!

	    //box.setLength(10);
	    //box.setWidth(10);

	    System.out.println("The box's width is: " + box.getWidth());
	    System.out.println("The box's length is: " + box.getLength());
	    System.out.println("The box's area is: " + box.getArea());
*/

	    String input;

	    input = JOptionPane.showInputDialog("What is your account's starting balance?");
	    BankAccount account = new BankAccount(input);
	    input = JOptionPane.showInputDialog("How much were you paid this month?");
	    account.deposit(input);
	    JOptionPane.showMessageDialog(null, "Your pay has been deposited.\n" +
                "Your current balance is: " + account.getBalance());
	    input = JOptionPane.showInputDialog("How much would you like to withdraw?");
	    account.withdraw(input);
        JOptionPane.showMessageDialog(null, "Your money has been withdrawn.\n" +
                "Your current balance is: " + account.getBalance());
        System.exit(0);
    }
}
