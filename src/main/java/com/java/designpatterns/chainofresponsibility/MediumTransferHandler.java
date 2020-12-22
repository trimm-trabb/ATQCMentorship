package com.java.designpatterns.chainofresponsibility;

public class MediumTransferHandler extends TransferHandler {

    @Override
    public void handleTransfer(BankTransfer transfer) {
        if (transfer.getAmount() > 1000 && transfer.getAmount() <= 50000) {
            System.out.println("Transfer needs to be confirmed by the customer over the phone;" +
                    " over to customer support");
        } else {
            this.getNextHandler().handleTransfer(transfer);
        }
    }
}
