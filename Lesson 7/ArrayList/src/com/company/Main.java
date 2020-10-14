package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Initializing an  ArrayList
	    ArrayList<String> myFriends = new ArrayList<String>();

	    // Adding values to an ArrayList
	    myFriends.add("Jesus");
        myFriends.add("Jaclyn");
        myFriends.add("Samuel");
        myFriends.add("Jonathan");

        // Find number of items in an ArrayList
        System.out.println(myFriends.size());

        // Find an item at a specified index
        System.out.println(myFriends.get(1));

        // Printing items to console
        for (String name : myFriends) {
            System.out.println(name);
        }

        // Converting an ArrayList to a string
        System.out.println(myFriends.toString());

        // Remove an element from the ArrayList
        myFriends.add("Evan");
        myFriends.remove(4);

        // Insert an element into an ArrayList
        myFriends.add(3, "isaac");

        // Replace an element in the List
        myFriends.set(3, "Isaac");

        // Change default capacity of 10
        ArrayList<String> list = new ArrayList<String>(100);

        // Initialize a list using <>
        ArrayList<String> myList = new ArrayList<>();
    }
}
