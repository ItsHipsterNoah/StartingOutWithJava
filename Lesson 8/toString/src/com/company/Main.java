package com.company;

public class Main {

    public static void main(String[] args) {
        Stock companyShare = new Stock("CS", 10.54);
        System.out.println(companyShare.toString());

        // Alternative:
        System.out.println(companyShare);
    }
}
