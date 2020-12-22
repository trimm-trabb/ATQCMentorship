package com.java.designpatterns.chainofresponsibility;

public class TransferHandlerChain {

    private TransferHandler chain;

    public TransferHandlerChain() {
        this.chain = new SmallTransferHandler();
        TransferHandler medium = new MediumTransferHandler();
        TransferHandler large = new LargeTransferHandler();
        chain.setNextHandler(medium);
        medium.setNextHandler(large);
    }

    public void processTransfer(BankTransfer transfer) {
        chain.handleTransfer(transfer);
    }
}