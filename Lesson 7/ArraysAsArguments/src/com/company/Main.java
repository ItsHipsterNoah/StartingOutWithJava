package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3};
	    displayArray(array);
    }

    public static void displayArray(int[] arr) {
        for(int num : arr) {
            System.out.println(num);
        }
    }

}

/*
     General notes
      -----------

      When an array is an argument to a function,
      a reference to the array is passed into the parameter
 */