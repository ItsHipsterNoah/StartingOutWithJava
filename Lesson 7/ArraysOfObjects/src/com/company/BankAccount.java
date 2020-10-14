package com.company;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount(String str) {
        this.balance = Double.parseDouble(str);
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void deposit(String amount) {
        balance += Double.parseDouble(amount);
    }

    public void withdraw(Double amount) {
        balance -= amount;
    }

    public void withdraw(String amount) {
        balance -= Double.parseDouble(amount);
    }

    public void setBalance(Double amount) {
        balance = amount;
    }

    public void setBalance(String amount) {
        balance = Double.parseDouble(amount);
    }

    public double getBalance() {
        return balance;
    }
}
