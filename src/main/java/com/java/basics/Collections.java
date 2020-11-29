package com.java.basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class Collections {

    public static void testArrayList() {
        System.out.println("TESTING ARRAYLIST");
        String s1 = "Harry Potter and the Philosopher's Stone";
        String s2 = "Harry Potter and the Chamber of Secrets";
        String s3 = "Harry Potter and the Prisoner of Azkaban";
        ArrayList<String> books = new ArrayList<String>();
        books.add(s1);
        books.add(s3);
        books.add(1, s2);
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        books.remove(0);
        books.remove("Harry Potter and the Chamber of Secrets");
        System.out.println("Updated list:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

    public static void testLinkedList() {
        System.out.println("TESTING LINKEDLIST");
        String s1 = "Thriller";
        String s2 = "Dangerous";
        String s3 = "Bad";
        String s4 = "HIStory";
        LinkedList<String> albums = new LinkedList<String>();
        albums.add(s1);
        albums.addFirst(s2);
        albums.add(1, s3);
        albums.addLast(s4);
        for (int i = 0; i < albums.size(); i++) {
            System.out.println(albums.get(i));
        }
        albums.remove(s1);
        albums.remove(0);
        albums.removeLast();
        System.out.println("Updated list:");
        for (int i = 0; i < albums.size(); i++) {
            System.out.println(albums.get(i));
        }
    }

    public static void testHashSet() {
        System.out.println("TESTING HASHSET");
        String s1 = "London";
        String s2 = "Melbourne";
        String s3 = "Tokyo";
        HashSet<String> cities = new HashSet<String>();
        cities.add(s1);
        cities.add(s2);
        cities.add(s3);
        for (String s : cities) {
            System.out.println(s);
        }
        System.out.println("Is " + s3 + " present in the list: " + cities.contains(s3));
        cities.removeAll(cities);
    }

    public static void testHashMap() {
        System.out.println("TESTING HASHMAP");
        HashMap<String, ArrayList<String>> writers = new HashMap<>();
        ArrayList<String> books1 = new ArrayList<String>();
        books1.add("Foundation");
        books1.add("The Gods Themselves");
        books1.add("Nightfall");
        writers.put("Isaac Asimov", books1);
        ArrayList<String> books2 = new ArrayList<String>();
        books2.add("Going Postal");
        books2.add("The Truth");
        writers.put("Terry Pratchett", books2);
        for (String s : writers.keySet()) {
            System.out.println(s + ": " + writers.get(s));
        }
        writers.remove("Terry Pratchett");
        System.out.println("Updated map:");
        for (String s : writers.keySet()) {
            System.out.println(s + ": " + writers.get(s));
        }
    }

    public static void main(String args[]) {
        testArrayList();
        testLinkedList();
        testHashSet();
        testHashMap();
    }
}