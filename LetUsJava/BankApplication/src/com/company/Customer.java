package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTrans) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(initialTrans);
    }

    public void addNewTransaction(double trans){
        transactions.add(trans);
    }

    public String getName() {
        return name;
    }
}
