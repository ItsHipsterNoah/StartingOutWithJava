package com.company;

public class Main {

    public static void main(String[] args) {

        // Initializes a StringBuilder
        // with 16 characters of space
        StringBuilder sb = new StringBuilder();

        // 100 character StringBuilder
        StringBuilder sb1 = new StringBuilder(100);

        // Initializes a StringBuilder with "Hello, world!"
        StringBuilder sb3 = new StringBuilder("Hello, world!");
        System.out.println(sb3);

        // Don't do this!
        // StringBuilder sb4 = "Hello, world!"

        // .append()
        StringBuilder str =  new StringBuilder();
        str.append("We sold ");
        str.append(12);
        str.append(" doughnuts for $");
        str.append(15.95);
        System.out.println(str);

        // .insert()
        StringBuilder city = new StringBuilder("New City");
        city.insert(4, "York ");
        System.out.println(city);

        // .insert() with a char array
        char[] cArray = {'2', '0', ' '};
        StringBuilder cars = new StringBuilder("In July we sold cars.");
        cars.insert(16, cArray);
        System.out.println(cars);

        // .replace()
        StringBuilder replaceMe = new StringBuilder("We moved from Chicago to Atlanta.");
        replaceMe.replace(14, 21, "New York");
        System.out.println(replaceMe);

        // .delete(), .deleteCharAt(), and .setCharAt()
        StringBuilder deleteMe = new StringBuilder("I ate 100 blueberries!");

        System.out.println(deleteMe);
        deleteMe.deleteCharAt(8);
        System.out.println(deleteMe);

        deleteMe.delete(9, 13);
        System.out.println(deleteMe);

        deleteMe.setCharAt(6, '5');
        System.out.println(deleteMe);

    }
}

/**
 *    General notes
 *    -------------
 *
 *
 *    While Strings are immutable, StringBuilder objects
 *    allow you to change specific characters, insert
 *    characters, delete characters, and perform other operations
 *
 *
 **/