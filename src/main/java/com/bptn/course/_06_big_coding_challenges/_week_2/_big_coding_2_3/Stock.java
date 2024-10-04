package com.bptn.course._06_big_coding_challenges._week_2._big_coding_2_3;

public class Stock {

    // Create instance variables 
    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

    // Constructor 
    public Stock(String tickerSymbol, String companyName, int price, int totalShares){
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        this.percentChange = 0;
        this.marketCap = totalShares * price;
    }

    // Create the methods 
    public void adjustPrice(int change){
        this.price += change;        
        this.percentChange = ((double)change * 100)/ this.price;
        this.marketCap = this.totalShares * this.price;        
    }

    public String toString(){     
            return "Ticker Symbol: " + this.tickerSymbol +
                "\nCompany: " + this.companyName +
                "\nCurrent Price: $" + this.price + " (" + this.percentChange + "%)" +
                "\nMarket Cap: $" + this.marketCap;

    }
    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}

