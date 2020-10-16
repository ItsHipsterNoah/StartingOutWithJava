package com.company;

public class Main {

    public static void main(String[] args) {
	    Person j = new Person("Jaclyn");
	    j.display();
	    j.defaultMethod();

	    Displayable n = new Person("Noah");
	    n.display();
	    n.defaultMethod();
    }
}

/*
        General notes
        ------------

        In its simplest form, an interface is like a class
        that contains only abstract methods. It cannot
        be instantiated.

        the methods that are specified in an interface have no bodies,
        only headers that are terminated by semicolons
 */