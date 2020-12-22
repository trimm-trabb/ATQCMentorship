package com.java.designpatterns.facade;

public class HolidayBookingTester {

    public static void main(String[] args) {
        HolidayBookingFacade facade = new HolidayBookingFacade();
        facade.bookHolidayPackage("Kyiv", "Zanzibar", 14);
    }
}