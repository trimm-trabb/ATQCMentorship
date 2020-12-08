package com.java.oop.airlines;

import java.util.ArrayList;
import java.util.List;

/* Airline class contains lists of Route and Aircraft objects. It has
aggregation relationship with Aircraft class and composition relationship
with Route class */
public class Airline {

    private String name;
    private List<Route> routes;
    private List<Aircraft> aircrafts;

    public Airline(String name) {
        this.name = name;
        this.routes = new ArrayList<>();
        this.aircrafts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public void addRoute(Route route) {
        this.routes.add(route);
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

    public void addAircraft(Aircraft aircraft) {
        this.aircrafts.add(aircraft);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", routes=" + routes +
                ", aircrafts=" + aircrafts +
                '}';
    }
}