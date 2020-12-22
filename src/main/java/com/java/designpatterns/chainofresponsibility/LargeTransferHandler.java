package com.java.designpatterns.chainofresponsibility;

public class LargeTransferHandler extends TransferHandler {

    @Override
    public void handleTransfer(BankTransfer transfer) {
        if (transfer.getAmount() > 50000) {
            System.out.println("Documents are required to confirm the transfer;" +
                    " over to financial services");
        }
    }
}
