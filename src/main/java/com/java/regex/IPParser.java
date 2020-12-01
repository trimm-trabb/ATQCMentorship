package com.java.regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.LineIterator;
import org.apache.commons.io.FileUtils;

public class IPParser {

    private final static Logger LOGGER = Logger.getLogger(IPParser.class.getName());

    public static String readStringFromFile(File file) {
        StringBuilder s = new StringBuilder();
        try (LineIterator li = FileUtils.lineIterator(file, "UTF-8")) {
            while (li.hasNext()) {
                s.append(li.nextLine());
            }
        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.WARNING, "An exception was thrown", ex);
        } catch (IOException ex) {
            LOGGER.log(Level.WARNING, "An exception was thrown", ex);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String fileName = "IPAddressText.txt";
        ClassLoader classLoader = IPParser.class.getClassLoader();
        try {
            File file = new File(classLoader.getResource(fileName).getFile());
            String s = readStringFromFile(file);
            System.out.println("File has been read");
            BasicRegEx.extractIPAddress(s);
        } catch (NullPointerException ex) {
            LOGGER.log(Level.WARNING, "An exception was thrown", ex);
        }
    }
}