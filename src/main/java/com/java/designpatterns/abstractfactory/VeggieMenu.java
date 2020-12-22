package com.java.designpatterns.abstractfactory;

public class VeggieMenu extends Menu {

    @Override
    public Burger serveBurger() {
        return new VeggieBurger();
    }

    @Override
    public Soup serveSoup() {
        return new VeggieSoup();
    }
}