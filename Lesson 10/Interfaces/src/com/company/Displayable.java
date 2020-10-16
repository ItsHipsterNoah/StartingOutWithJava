package com.company;

public interface Displayable {
    // public is omitted, as all interface methods are implicitly public
    void display();

    // Java 8 and above: default methods
    default void defaultMethod() {
        System.out.println("This the default method.");
    }

    // Fields are treated as final and static
    int FIELD1 = 1;
}
