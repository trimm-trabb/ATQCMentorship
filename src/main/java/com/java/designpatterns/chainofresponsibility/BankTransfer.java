package com.java.designpatterns.chainofresponsibility;

public class BankTransfer {

    private double amount;

    public BankTransfer(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}