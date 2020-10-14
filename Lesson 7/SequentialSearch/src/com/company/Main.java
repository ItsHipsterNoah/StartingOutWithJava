package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] tests = {87, 75, 98, 100, 82};
	    int result = sequentialSearch(100, tests);
	    if (result == -1) {
	        System.out.println("You did not earn 100 on any test.");
        }
	    else {
	        System.out.println("You earned 100 on test " + (result+1));
        }
    }

    public static int sequentialSearch(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

}