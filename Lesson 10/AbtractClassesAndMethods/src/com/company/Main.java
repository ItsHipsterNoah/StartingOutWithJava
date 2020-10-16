package com.company;

public class Main {

    public static void main(String[] args) {
	    CompSciStudent student = new CompSciStudent("Noah Thompson", "12345", 2020);
	    student.setCsHours(20);
	    student.setGenEdHours(40);
	    student.setMathHours(20);

	    System.out.println(student);
    }
}
