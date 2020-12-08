package com.java.oop.drivers;

import org.apache.log4j.Logger;

public abstract class MyDriver implements IDriver {

    final static Logger logger = Logger.getLogger(MyDriver.class);
    // field is set to true if the method clickOnButton is performed at least once
    private static boolean buttonClicked = false;

    public boolean isButtonClicked() {
        return buttonClicked;
    }

    public static void setButtonClicked(boolean buttonClicked) {
        MyDriver.buttonClicked = buttonClicked;
    }

    protected void clickOnElement() {
        logger.info("Invoking clickOnElement");
    }

    void findElement() {
        logger.info("Invoking findElement");

    }

    @Override
    public void getTextOfElement() {
        findElement();
        logger.info("Invoking getTextOfElement");
    }

    @Override
    public void clickOnButton() {
        clickOnElement();
        logger.info("Invoking clickOnButton");
        buttonClicked = true;
    }
}