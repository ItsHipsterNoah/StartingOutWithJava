package com.company;

public class Stock {
    private String symbol;
    private double sharePrice;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.sharePrice = price;
    }
    public String getSymbol() {
        return symbol;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public String toString() {
        return "Trading symbol: " + symbol + "\nShare price: " + sharePrice;
    }

    public boolean equals(Stock s) {
        if ((this.symbol == s.symbol) && (this.sharePrice == s.sharePrice)) {
            return true;
        }
        else {
            return false;
        }
    }
}
