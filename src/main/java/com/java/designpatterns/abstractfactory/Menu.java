package com.java.designpatterns.abstractfactory;

public abstract class Menu {

    public Menu() {
    }

    public abstract Burger serveBurger();

    public abstract Soup serveSoup();
}