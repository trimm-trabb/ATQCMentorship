package com.java.basics;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Exceptions {

    private final static Logger LOGGER = Logger.getLogger(Files.class.getName());

    public static int divideInteger(int x, int y) {
        int res = 0;
        try {
            res = x / y;
        } catch (ArithmeticException ex) {
            LOGGER.log(Level.INFO, "An exception was thrown", ex);
        }
        return res;
    }

    public static void main(String[] args) {
        int x = 100, y = 0;
        System.out.println(x + "/" + y + " = " + divideInteger(x, y));
    }
}