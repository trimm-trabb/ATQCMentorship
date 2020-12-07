package com.java.basics;

import com.java.basics.dto.Person;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectSerialization {

    private final static Logger LOGGER = Logger.getLogger(Files.class.getName());

    public static String serialize(Object o) {
        String filename = null;
        try {
            FileOutputStream file = new FileOutputStream("file.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(o);
            out.close();
            file.close();
            filename = "file.ser";
            System.out.println("Object has been serialized");
        } catch (IOException ex) {
            LOGGER.log(Level.WARNING, "An exception was thrown", ex);
        }
        return filename;
    }

    public static Object deserialize(String filename) {
        Object o1 = null;
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            o1 = in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized ");
        } catch (IOException ex) {
            LOGGER.log(Level.WARNING, "An exception was thrown", ex);
        } catch (ClassNotFoundException ex) {
            LOGGER.log(Level.WARNING, "An exception was thrown", ex);
        }
        return o1;
    }

    public static void main(String[] args) {
        Person p = new Person("Alex", 30, "Toyota");
        String filename = serialize(p);
        if (filename != null) {
            Person p1 = (Person) deserialize(filename);
            System.out.println(p1);
        }
    }
}