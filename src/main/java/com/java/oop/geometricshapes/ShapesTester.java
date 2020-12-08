package com.java.oop.geometricshapes;

import java.awt.Color;

public class ShapesTester {

    public static void main(String[] args) {
        Shape shape1 = new Circle(Color.BLACK, 2.5);
        Shape shape2 = new Rectangle(2.5, 4);
        System.out.println("shape1: " + shape1);
        System.out.println("Area of shape1: " + shape1.calculateArea());
        System.out.println("Perimeter of shape1: " + shape1.calculatePerimeter());
        System.out.println("shape2: " + shape2);
        System.out.println("Area of shape2: " + shape2.calculateArea());
        System.out.println("Perimeter of shape2: " + shape2.calculatePerimeter());
    }
}