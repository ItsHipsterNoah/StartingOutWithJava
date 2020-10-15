package com.company;

public class Instructor {
    private String lastName;
    private String firstName;
    private String officeNumber;

    public Instructor(String lastName, String firstName, String office) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNumber = office;
    }
    Instructor(Instructor i) {
        this.lastName = i.lastName;
        this.firstName = i.firstName;
        this.officeNumber = i.officeNumber;
    }
    public void set(String lastName, String firstName, String office) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNumber = office;
    }
    public String toString() {
        return "Professor " + firstName + " "  + lastName + "\nOffice Number: " + officeNumber;
    }
}
