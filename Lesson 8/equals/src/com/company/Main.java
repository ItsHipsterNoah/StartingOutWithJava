package com.company;

public class Main {

    public static void main(String[] args) {
	    Stock oracle = new Stock("ORCL", 60.96);
	    Stock microsoft = new Stock("MSFT", 220.86);

	    if (oracle.equals(microsoft)) {
	        System.out.println("The stocks are the same");
        }
	    else {
            System.out.println("The stocks are not the same");
        }

        if (oracle.equals(oracle)) {
            System.out.println("The stocks are the same");
        }
        else {
            System.out.println("The stocks are not the same");
        }

    }
}
