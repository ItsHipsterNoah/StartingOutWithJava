package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum(10,20,30,40,50));
    }

    public static int sum(int...numbers) {
        int sum = 0;
        for (int val : numbers) {
            sum += val;
        }
        return sum;
    }

}
