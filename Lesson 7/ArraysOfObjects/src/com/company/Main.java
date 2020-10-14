package com.company;

import java.awt.desktop.SystemEventListener;

public class Main {

    public static void main(String[] args) {
	    final int NUM_ACCOUNTS = 5;
	    BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];
	    for (BankAccount acc : accounts) {
	        // Prints out nulls (default value)
            System.out.println(acc);
        }
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();
            System.out.println(accounts[i].getBalance());
        }
    }
}
