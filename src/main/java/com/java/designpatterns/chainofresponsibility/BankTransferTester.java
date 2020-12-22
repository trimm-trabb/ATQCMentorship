package com.java.designpatterns.chainofresponsibility;

public class BankTransferTester {

    public static void main(String[] args) {
        TransferHandlerChain chain = new TransferHandlerChain();
        BankTransfer smallTransfer = new BankTransfer(600);
        BankTransfer mediumTransfer = new BankTransfer(6000);
        BankTransfer largeTransfer = new BankTransfer(60000);
        chain.processTransfer(smallTransfer);
        chain.processTransfer(mediumTransfer);
        chain.processTransfer(largeTransfer);
    }
}