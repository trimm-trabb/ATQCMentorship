package com.java.designpatterns.facade;

public class HolidayBookingFacade {

    private FlightBooking flightBooking;
    private HotelBooking hotelBooking;
    private InsuranceBooking insuranceBooking;

    public HolidayBookingFacade() {
        this.flightBooking = new FlightBooking();
        this.hotelBooking = new HotelBooking();
        this.insuranceBooking = new InsuranceBooking();
    }

    public void bookHolidayPackage(String origin, String destination, int duration) {
        flightBooking.bookFlight(origin, destination);
        hotelBooking.bookHotel(destination, duration);
        insuranceBooking.buyInsurance(destination,duration);
    }
}
