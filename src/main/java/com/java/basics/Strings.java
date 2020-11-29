package com.java.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Strings {

    public static void concatStrings() {
        //Create 2 different strings. Concatenate them and print result.
        System.out.println("CONCATENATING STRINGS:");
        String s1 = "Another one";
        String s2 = " bites the dust";
        s1 = s1.concat(s2);
        System.out.println(s1);
        String s3 = "The answer to the ";
        String s4 = "Ultimate Question of Life, the Universe, and Everything is ";
        int a = 42;
        String s5 = s3 + s4 + a;
        System.out.println(s5);
    }

    public static void trimString() {
        //Create string "   egweerw  ererferw  kuy  yu i ". Print its length;
        //Trim string and print result. Print length of trimmed string.
        System.out.println("TRIMMING STRINGS:");
        String s1 = "   egweerw  ererferw  kuy  yu i ";
        System.out.println("Length of string " + s1 + " : " + s1.length());
        String s2 = s1.trim();
        System.out.println("Length of string " + s2 + " : " + s2.length());
    }

    public static void splitString() {
        //Create string "   egweerw  ererferw  kuy  yu i ".
        //Split string by spaces and print each value in separate row.
        System.out.println("SPLITTING STRING BY SPACES:");
        String s1 = "   egweerw  ererferw  kuy  yu i ";
        String[] s1Array = s1.split("\\s+");
        for (String s : s1Array) {
            System.out.println(s);
        }
    }

    public static void splitStringWithNoSpaces() {
        //Create string "   egweerw  ererferw  kuy  yu i ". Split string by spaces;
        //Clean empty spaces form result; Print each result value in a separate row.
        System.out.println("SPLITTING TRIMMED STRING BY SPACES:");
        String s1 = "   egweerw  ererferw  kuy  yu i ";
        String[] s1Array = s1.trim().split("\\s+");
        for (String s : s1Array) {
            System.out.println(s);
        }
    }

    public static void capitalizeString() {
        //Create string "   egweerw  ererferw  kuy  yu i ".
        //Convert all characters to uppercase. Print result.
        System.out.println("CAPITALIZING STRING:");
        String s1 = "   egweerw  ererferw  kuy  yu i ";
        s1 = s1.toUpperCase();
        System.out.println(s1);
    }

    public static void capitalizeW() {
        //Create string "   egweerw  ererferw  kuy  yu i ", convert all 'w' to uppercase. Print result
        System.out.println("CAPITALIZING 'W':");
        String s1 = "   egweerw  ererferw  kuy  yu i ";
        while (s1.indexOf('w') != -1) {
            int i = s1.indexOf('w');
            s1 = s1.substring(0, i) + s1.substring(i, i + 1).toUpperCase() + s1.substring(i + 1);
        }
        System.out.println(s1);
    }

    public static void capitalizeFirstW() {
        //Create string "   egweerw  ererferw  kuy  yu i ". Convert first 'w' to uppercase. Print result
        System.out.println("CAPITALIZING FIRST 'W':");
        String s1 = "   egweerw  ererferw  kuy  yu i ";
        int i = s1.indexOf('w');
        if (i != -1) {
            s1 = s1.substring(0, i) + s1.substring(i, i + 1).toUpperCase() + s1.substring(i + 1);
        }
        System.out.println(s1);
    }

    public static void parsePrices() {
        //Create string "this item previous price $5.99, Sale price $1.99. ".
        // Parse original and sale price from string and print them.
        String s1 = "this item previous price $5.99, Sale price $1.99.";
        Pattern pattern = Pattern.compile("[$]\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(s1);
        ArrayList<String> prices = new ArrayList<String>();
        while (matcher.find()) {
            prices.add(s1.substring(matcher.start(), matcher.end()));
        }
        System.out.println(prices);
    }

    public static void main(String args[]) {
        concatStrings();
        trimString();
        splitString();
        splitStringWithNoSpaces();
        capitalizeString();
        capitalizeW();
        capitalizeFirstW();
        parsePrices();
    }
}