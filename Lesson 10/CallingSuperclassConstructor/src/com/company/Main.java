package com.company;

public class Main {

    public static void main(String[] args) {
        SubClass sub = new SubClass();
    }
}

/*
        General notes
        -------------
        1. Superclass constructor always executes before subclass constructor
        2.  You can write a super statement that calls a superclass constructor, but only in the subclass’s constructor. You cannot call the superclass constructor from any other method.
        3. If a super statement that calls a superclass constructor appears in a subclass constructor, it must be the first statement.
        4. If a subclass constructor does not explicitly call a superclass constructor, Java will automatically call super() just before the code in the subclass’s constructor executes.
        5. If a superclass does not have a default constructor and does not have a no-arg constructor, then a class that inherits from it must call one of the constructors that the superclass does have.
 */