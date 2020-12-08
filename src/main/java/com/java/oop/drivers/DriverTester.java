package com.java.oop.drivers;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class DriverTester {

    final static Logger logger = Logger.getLogger(DriverTester.class);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 1 to create an instance of MyDriverChild1\n" +
                "or 2 to create an instance of MyDriverChild2: ");
        int type = in.nextInt();
        MyDriver driver = null;
        switch (type) {
            case 1:
                driver = new MyDriverChild1();
                break;
            case 2:
                driver = new MyDriverChild2();
                break;
            default:
                logger.error("Wrong input");
        }
        if (driver != null) {
            driver.getTextOfElement();
            driver.clickOnButton();
            driver.clickOnButton();
        }
    }
}