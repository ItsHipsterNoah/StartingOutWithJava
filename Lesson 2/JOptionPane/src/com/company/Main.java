package com.company;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

	    JOptionPane.showMessageDialog(null, "Hello, World!");

        String name; int age;

        name = JOptionPane.showInputDialog("Enter your name: "); // null if nothing is entered
        age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?: ")); // Note: showInputDialog always returns a string. Here we convert string input into an int
        JOptionPane.showMessageDialog(null, "Hello there, " + name + "! You are " + age + " years old!");
        
        System.exit(0);// required when using JOptionPane
    }
}
