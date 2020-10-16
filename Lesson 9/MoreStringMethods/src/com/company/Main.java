package com.company;

public class Main {

    public static void main(String[] args) {
	    String str = "Four score and seven years ago...";
	    String str2 = "I am seven years old!";

	    if(str.startsWith("Four")) {
	        System.out.println("The string starts with Four");
        }
	    if (str.endsWith("..")) {
	        System.out.println("The string ends with an ellipsis");
        }
	    if (str.regionMatches(true,15, str2, 5, 11)) {
	        System.out.println("The regions match");
        }
	    if (str.indexOf('F') == 0) {
	        System.out.println("Capital F is in the string");
        }
	    System.out.println(str2.substring(5,11));
	    System.out.println("     WHITE SPAAAAAACE     ".trim());

	    char[] letters = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(String.valueOf(letters));


    }
}
