package com.java.oop.geometricshapes;

import java.awt.Color;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(Color colour, double height, double width) {
        super(colour);
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return (height * width);
    }

    public double calculatePerimeter() {
        return (2 * (height + width));
    }

    public String toString() {
        return super.toString() + " height: " + height + " width: " + width;
    }
}