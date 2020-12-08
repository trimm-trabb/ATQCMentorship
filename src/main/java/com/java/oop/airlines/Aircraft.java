package com.java.oop.airlines;

public class Aircraft {

    private final int id;
    private String make;
    private String model;
    private Airline airline;
    private static int numberOfAircrafts = 0;

    public Aircraft(String make, String model) {
        id = ++numberOfAircrafts;
        this.make = make;
        this.model = model;
    }

    public Aircraft(String make, String model, Airline airline) {
        id = ++numberOfAircrafts;
        this.make = make;
        this.model = model;
        this.airline = airline;
    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "id='" + id + '\'' +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", airline=" + airline.getName() +
                '}';
    }
}