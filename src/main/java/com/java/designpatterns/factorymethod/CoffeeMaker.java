package com.java.designpatterns.factorymethod;

public abstract class CoffeeMaker {

    public CoffeeMaker() {
    }

    public abstract Coffee makeCoffee();

    public void clean() {
        System.out.println("Coffee maker has been cleaned");
    }

    public void pourCoffee() {
        System.out.println("Coffee has been poured");
    }
}