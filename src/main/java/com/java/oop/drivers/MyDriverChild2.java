package com.java.oop.drivers;

import org.apache.log4j.Logger;

public class MyDriverChild2 extends MyDriver {

    final static Logger logger = Logger.getLogger(MyDriverChild2.class);

    @Override
    public void clickOnButton() {
        if (!this.isButtonClicked()) {
            clickOnElement();
            logger.info("Invoking clickOnButton");
            setButtonClicked(true);
        } else
            logger.info("Button has already been clicked before");
    }
}