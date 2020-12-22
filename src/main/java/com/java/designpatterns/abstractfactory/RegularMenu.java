package com.java.designpatterns.abstractfactory;

public class RegularMenu extends Menu {

    @Override
    public Burger serveBurger() {
        return new MeatBurger();
    }

    @Override
    public Soup serveSoup() {
        return new ChickenSoup();
    }
}