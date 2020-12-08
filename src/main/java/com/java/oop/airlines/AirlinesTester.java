package com.java.oop.airlines;

public class AirlinesTester {

    public static void main(String[] args) {
        Airline lufthansa = new Airline("Lufthansa");
        Aircraft boeing747 = new Aircraft("Boeing", "747");
        boeing747.setAirline(lufthansa);
        lufthansa.addAircraft(boeing747);
        Aircraft dreamliner = new Aircraft("Boeing", "787 Dreamliner", lufthansa);
        lufthansa.addAircraft(dreamliner);
        Route lhrjfk = new Route(lufthansa, "London", "New York");
        lufthansa.addRoute(lhrjfk);
        System.out.println(lufthansa);
    }
}