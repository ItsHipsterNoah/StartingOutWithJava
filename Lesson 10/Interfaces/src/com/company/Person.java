package com.company;

public class Person implements Displayable {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Hi! My name is " + this.name);
    }

    // Note that Person does not implement defaultMethod()
}
