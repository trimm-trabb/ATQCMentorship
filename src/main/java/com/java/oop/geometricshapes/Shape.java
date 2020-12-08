package com.java.oop.geometricshapes;

import java.awt.Color;

public abstract class Shape {

    private Color colour;

    public Shape(Color colour) {
        this.colour = colour;
    }

    public Shape() {
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        if (colour != null)
            return "Colour: " + colour;
        return "Colour: not specified";
    }
}
