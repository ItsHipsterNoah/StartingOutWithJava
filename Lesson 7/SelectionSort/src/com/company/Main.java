package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {5, 7, 2, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
	    selectionSort(arr);
        System.out.print("\n");
	    for (int i = 0; i < arr.length; i++){
	        System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] array) {
        int minValue = array[0], minIndex = 0, startScan;

        for (startScan = 0; startScan < (array.length-1); startScan++) {
            minIndex = startScan;
            minValue = array[startScan];

            for (int i = startScan + 1; i < array.length; i++) {
                if (array[i] < minValue) {
                    minValue = array[i];
                    minIndex = i;
                }
            }

            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }
    }

}
