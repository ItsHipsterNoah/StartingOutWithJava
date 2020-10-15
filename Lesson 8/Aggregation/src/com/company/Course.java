package com.company;

public class Course {
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;

    public Course(String courseName, Instructor instructor, TextBook textBook) {
        this.courseName = courseName;
        // Always assign by reference, as shown below
        this.instructor = new Instructor(instructor);
        this.textBook = new TextBook(textBook);
    }

    public String getName() {

        return courseName;
    }

    public Instructor getInstructor() {
        // Return copies of fields, NOT THE ORIGINALS.
        return new Instructor(instructor);
    }

    public TextBook getTextBook() {
        return new TextBook(textBook);
    }

    public String toString() {
        return courseName + ", taught by " + instructor.toString() + "\nTextbook: " + textBook.toString();
    }

}
