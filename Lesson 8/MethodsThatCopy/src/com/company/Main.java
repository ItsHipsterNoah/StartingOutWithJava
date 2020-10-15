package com.company;

public class Main {

    public static void main(String[] args) {
	    // This code does not copy company1 into company2.
        // After the assignment occurs, they will both
        // reference the same object.
        Stock company1 = new Stock("XYZ", 9.62);
        Stock company2 = company1.copy();

        System.out.println("Company 1:\n" + company1);
        System.out.println();
        System.out.println("Company 2:\n" + company2);

        if (company1 == company2) {
            System.out.println("The company1 and company2 variables reference the same object.");
        }
        else {
            System.out.println("The company1 and company2 variables reference different objects.");
        }

        Stock company3 = new Stock(company2);
    }
}
