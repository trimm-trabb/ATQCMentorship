package com.java.oop.geometricshapes;

import java.awt.Color;

public class Circle extends Shape {

    private double radius;

    public Circle(Color colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return (Math.PI * radius * radius);
    }

    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }

    public String toString() {
        return super.toString() + " radius: " + radius;
    }
}