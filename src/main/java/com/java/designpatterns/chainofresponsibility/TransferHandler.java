package com.java.designpatterns.chainofresponsibility;

public abstract class TransferHandler {

    private TransferHandler nextHandler;

    public TransferHandler() {
    }

    public void setNextHandler(TransferHandler handler) {
        this.nextHandler = handler;
    }

    public TransferHandler getNextHandler() {
        return nextHandler;
    }

    public abstract void handleTransfer(BankTransfer transfer);
}