package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(BinarySearch(arr, 5));
    }


    public static int BinarySearch(int[] array, int value) {
        int min = 0, max = array.length - 1, mid;
        boolean found = false; int pos = -1;

        while (!found && min <= max) {
            mid = (min + max) / 2;
            if (array[mid] == value) {
                found = true;
                pos = mid;
            } else if (array[mid] > value) {
                max = mid -1;
            } else if (array[mid] < value) {
                min = mid + 1;
            } else {
                return -1;
            }
        }
        return pos;
    }
}