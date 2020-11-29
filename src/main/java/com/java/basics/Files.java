package com.java.basics;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.*;

public class Files {

    private final static Logger LOGGER = Logger.getLogger(Files.class.getName());

    public static ArrayList<Integer> readIntegersWithBufferedReader(File file) {
        ArrayList<Integer> integers = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            integers = new ArrayList<>();
            String s;
            while ((s = br.readLine()) != null) {
                if (s.matches("\\d{1,9}")) {
                    integers.add(Integer.parseInt(s));
                }
            }
        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.WARNING, "An exception was thrown", ex);
        } catch (IOException ex) {
            LOGGER.log(Level.WARNING, "An exception was thrown", ex);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    LOGGER.log(Level.WARNING, "An exception was thrown", ex);
                }
            }
        }
        return integers;
    }

    public static ArrayList<Integer> readIntegersWithLineIterator(File file) {
        ArrayList<Integer> integers = null;
        try (LineIterator li = FileUtils.lineIterator(file, "UTF-8")) {
            integers = new ArrayList<>();
            while (li.hasNext()) {
                String s = li.nextLine();
                if (s.matches("\\d{1,9}")) {
                    integers.add(Integer.parseInt(s));
                }
            }
        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.WARNING, "An exception was thrown", ex);
        } catch (IOException ex) {
            LOGGER.log(Level.WARNING, "An exception was thrown", ex);
        }
        return integers;
    }

    public static double findAverage(ArrayList<Integer> integers) {
        double average = 0;
        if (!integers.isEmpty()) {
            int sum = 0;
            for (int i : integers) {
                sum += i;
            }
            average = (double) sum / integers.size();
        }
        return average;
    }

    public static void main(String[] args) {
        String fileName = "test.txt";
        ClassLoader classLoader = Files.class.getClassLoader();
        try {
            File file = new File(classLoader.getResource(fileName).getFile());
            ArrayList<Integer> integers1 = readIntegersWithBufferedReader(file);
            ArrayList<Integer> integers2 = readIntegersWithLineIterator(file);
            double average = findAverage(integers1);
            System.out.println(integers1);
            System.out.println(integers2);
            System.out.println(average);
        } catch (NullPointerException ex) {
            LOGGER.log(Level.WARNING, "An exception was thrown", ex);
        }
    }
}