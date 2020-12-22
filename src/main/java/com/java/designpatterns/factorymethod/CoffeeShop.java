package com.java.designpatterns.factorymethod;

import java.util.Scanner;

public class CoffeeShop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which coffee do you want? Turkish/V60: ");
        String answer = in.nextLine();
        CoffeeMaker c = null;
        switch (answer) {
            case "Turkish":
                c = new Cezve();
                break;
            case "V60":
                c = new V60CoffeeMaker();
                break;
            default:
                System.out.println("Wrong input");
        }
        if (c != null) {
            c.makeCoffee();
            c.pourCoffee();
            c.clean();
        }
    }
}