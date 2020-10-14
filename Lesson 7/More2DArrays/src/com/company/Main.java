package com.company;

public class Main {

    public static void main(String[] args) {
	    // Initializing a 2D array
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Rows
        for (int r = 0; r < numbers.length; r++) {
            // Columns
            for (int c = 0; c < numbers[r].length; c++) {
                System.out.print(numbers[r][c] + " ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int r = 0; r < numbers.length; r++) {
            int sum = 0;
            for (int c = 0; c < numbers[r].length; c++) {
                sum += numbers[r][c];
            }
            System.out.println("Row sum: " + sum);
        }

        int sum = 0;
        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[r].length; c++) {
                sum += numbers[r][c];
            }
        }
        System.out.println("Total sum: " + sum);

    }
}
