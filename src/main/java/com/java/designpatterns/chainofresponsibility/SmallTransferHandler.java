package com.java.designpatterns.chainofresponsibility;

public class SmallTransferHandler extends TransferHandler {

    @Override
    public void handleTransfer(BankTransfer transfer) {
        if (transfer.getAmount() <= 1000) {
            System.out.println("Bank transfer successfully sent");
        } else {
            this.getNextHandler().handleTransfer(transfer);
        }
    }
}