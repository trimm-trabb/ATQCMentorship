package com.java.designpatterns.factorymethod;

public class Cezve extends CoffeeMaker {

    @Override
    public Coffee makeCoffee() {
        return new TurkishCoffee();
    }
}