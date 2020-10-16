package com.company;

// Abstract class, cannot be instantiated
public abstract class Student {
    private String name;
    private String idNumber;
    private int yearAdmitted;

    // Abstract method - must be implemented in derived class
    public abstract int getRemainingHours();

    public Student(String n, String id, int year) {
        this.name = n;
        this.idNumber = id;
        this.yearAdmitted = year;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nID Number: " + this.idNumber + "\nYear Admitted: " + this.yearAdmitted;
    }


}
