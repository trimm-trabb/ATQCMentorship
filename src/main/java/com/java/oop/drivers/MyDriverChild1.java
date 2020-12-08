package com.java.oop.drivers;

import org.apache.log4j.Logger;

public class MyDriverChild1 extends MyDriver {

    final static Logger logger = Logger.getLogger(MyDriverChild1.class);

    //overloading method of parent class
    public void getTextOfElement(boolean printName) {
        findElement();
        if (printName)
            logger.info("Invoking getTextOfElement; Element name = meow");
        else
            logger.info("Invoking getTextOfElement");
    }
}