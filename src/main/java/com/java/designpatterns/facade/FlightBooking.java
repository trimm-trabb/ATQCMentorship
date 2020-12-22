package com.java.designpatterns.facade;

public class FlightBooking {

    public void bookFlight(String origin, String destination) {
        System.out.println("Return flight " + origin + " - " + destination + " has been booked");
    }
}
