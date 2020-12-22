package com.java.designpatterns.facade;

public class HotelBooking {

    public void bookHotel(String destination, int duration) {
        System.out.println("Hotel in " + destination + " has been booked for " + duration + " days");
    }
}
