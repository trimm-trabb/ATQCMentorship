package com.java.designpatterns.factorymethod;

public class V60CoffeeMaker extends CoffeeMaker {

    @Override
    public Coffee makeCoffee() {
        return new V60();
    }
}