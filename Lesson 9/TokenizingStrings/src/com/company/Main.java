package com.company;

public class Main {
    public static void main(String[] args) {
        String str = "one two three four";

        String[] tokens = str.split(" ");

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
