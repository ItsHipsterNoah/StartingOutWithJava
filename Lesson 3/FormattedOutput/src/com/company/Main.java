package com.company;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	    System.out.printf("Hello, world!\n");

	    double sales = 1234567.89;
	    System.out.printf("Our sales are %f for the day. \n", sales);

	    // Formatting floats
	    double temp1 = 72.5; double temp2 = 83.7;
	    System.out.printf("The temperatures are %f and %f degrees.\n", temp1, temp2);

	    // Formatting ints
	    int hours = 40;
	    System.out.printf("I worked %d hours this week.\n", hours);

	    int dogs = 2, cats = 3;
	    System.out.printf("We own %d dogs and %d cats.\n", dogs, cats);

	    // Precision

        // Syntax for format specifier:
        // %[flags][width][.precision]conversion

        double temp = 78.42819;
        System.out.printf("The temperature is %.2f degrees\n\n", temp);

        System.out.printf("The temperature is %.1f degrees\n", temp);

        // Minimum field width
        double number = 12345.6789;
        System.out.printf("The number is:%20f \n", number);

        // Left justifying numbers
        System.out.printf("The number is: %-20f \n", number);

        // Minimum field width and precision
        System.out.printf("The number is: %12.2f \n", number);

        // Comma separators
        System.out.printf("%,.4f \n", number);

        // Formatting strings
        String name = "Jaclyn";
        System.out.printf("Your name is %s \n", name);

        // String.format
        double monthlyPay = 5000.0;
        double annualPay = monthlyPay * 12;
        String output = String.format("Your annual pay is $%,.2f", annualPay);
        JOptionPane.showMessageDialog(null, output);
    }
}
