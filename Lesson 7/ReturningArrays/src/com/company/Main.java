package com.company;

public class Main {

    public static void main(String[] args) {
	    for (double val : getArray()) {
	        System.out.print(val + " ");
        }
    }

    public static double[] getArray() {
        double[] array = {1.2, 2.3, 4.5, 6.7, 8.9};
        return array;
    }

}
