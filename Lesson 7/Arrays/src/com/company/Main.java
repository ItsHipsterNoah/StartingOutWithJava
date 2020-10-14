package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        final int NUM_EMP = 5;
        int[] hours = new int[NUM_EMP];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the hours worked by " + NUM_EMP + " employees");
        for (int i = 0; i < NUM_EMP; i++) {
            System.out.print("Employee " + (i+1) + ": ");
            hours[i] = keyboard.nextInt();
        }
        System.out.println("The hours you entered are: ");
        for (int i = 0; i < NUM_EMP; i++) {
            System.out.println(hours[i]);
        }

        /* Alternative: use built-in length function:

            for (int i = 0; i < hours.length; i++) {
                System.out.println(hours[i]);
            }
        */

        // Array initialization
        int[] days = {31, 28, 31, 20, 31, 31, 30};

        // Alternative C-like instantiation
        int numbers[];

        // Multiple array instantiation (all three of these variables are array references)
        int[] codes, scores, salaries;

        System.out.println("");

        // Java foreach loop demo
        int[] nums = {1,2,3};
        for (int val : nums) {
            System.out.println(val);
        }
    }
}

/*
    General notes
    -------------

    Java performs array-bounds checking. An attempt to read/write a location
    outside of an array will result in an exception being thrown.

 */
