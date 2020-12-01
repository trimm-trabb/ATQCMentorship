package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegEx {

    public static void parseDigits(String s) {
        System.out.println("Parsing numbers from the string:");
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group() + " ");
        }
    }

    public static void parseWords(String s) {
        System.out.println("Parsing words from the string:");
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group() + " ");
        }
    }

    public static void extractStringAfterSymbol(String s, Character symbol) {
        System.out.println("Extracting part of the string after " + symbol + " symbol:");
        Pattern pattern = Pattern.compile("[^" + symbol + "]*$");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            System.out.println(s.substring(matcher.start(), matcher.end()));
        }
    }

    public static void extractIPAddress(String s) {
        System.out.println("Extracting IP addresses from string:");
        Pattern pattern = Pattern.compile("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}" +
                "([1-9][0-9]|[0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group() + " ");
        }
    }

    public static void main(String[] args) {
        String s = "This is a sample 23 text 46: with 11223 numbers in it";
        String ip = "Blah blah 203.120.223.13 blah 255.255.111.35";
        Character symbol = ':';
        parseDigits(s);
        parseWords(s);
        extractStringAfterSymbol(s, symbol);
        extractIPAddress(ip);
    }
}