package com.java.oop.airlines;

public class Route {

    private Airline airline;
    private String origin;
    private String destination;

    public Route(Airline airline, String origin, String destination) {
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Route{" +
                "airline=" + airline.getName() +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}