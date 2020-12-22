package com.java.designpatterns.abstractfactory;

import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Are you a vegetarian? Y/N: ");
        String answer = in.nextLine();
        Menu m = null;
        switch (answer) {
            case "Y":
                m = new VeggieMenu();
                break;
            case "N":
                m = new RegularMenu();
                break;
            default:
                System.out.println("Wrong input");
        }
        if (m != null) {
            m.serveBurger();
            m.serveSoup();
        }
    }
}