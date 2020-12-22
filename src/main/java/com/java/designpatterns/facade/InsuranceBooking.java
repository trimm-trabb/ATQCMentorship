package com.java.designpatterns.facade;

public class InsuranceBooking {

    public void buyInsurance(String destination, int duration) {
        System.out.println("Insurance covering your stay in " + destination + " for " + duration + " days " +
                "was added to your trip");
    }
}
