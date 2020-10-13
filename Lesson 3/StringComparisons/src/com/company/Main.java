package com.company;

public class Main {

    public static void main(String[] args) {
    // String Equality Comparison
	// To compare the contents of two String objects correctly
    // you should use the String class’s equals method.
        String name1 = "Noah", name2 = "Jaclyn";
        if (name1.equals(name2)) {
            System.out.println("The names are the same.");
        }
        else {
            System.out.println("The names are different.");
        }

        /* Alternative:

        if ("Noah".equals("Jaclyn")) {
            System.out.println("The names are the same.");
        }
        else {
            System.out.println("The names are different.");
        }

         */

        // Comparing strings
        if (name1.compareTo(name2) < 0) {
            System.out.println(name1 + "is lexicographically less than" + name2);
        }
        else if (name1.compareTo(name2) == 0) {
            System.out.println(name1 + "is lexicographically equal to" + name2);
        }
        else {
            System.out.println(name1 + "is lexicographically greater than " + name2);
        }
       
    }
}
