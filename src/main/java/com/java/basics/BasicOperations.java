package com.java.basics;

public class BasicOperations {

    public static void compareBooleans() {
        //create 4 boolean variables (true, true, false, false) and compare them, result print in console
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = false;
        System.out.println("COMPARING BOOLEAN VARIABLES");
        System.out.println(b1 + " == " + b2 + ": " + (b1 == b2));
        System.out.println(b1 + " == " + b3 + ": " + (b1 == b3));
        System.out.println(b3 + " == " + b4 + ": " + (b3 == b4));
    }

    public static void compareNumericValues() {
        //create 4 different numeric values and compare them using <,<=,!=,==,===,>,>=
        // there's no === operator in java
        int a = 42;
        int b = -75;
        double c = 42;
        double d = 42.42;
        float e = 42.42f;
        System.out.println("COMPARING NUMERIC VARIABLES");
        System.out.println(a + " < " + b + ": " + (a < b));
        System.out.println(b + " <= " + a + ": " + (b <= a));
        System.out.println(c + " != " + d + ": " + (c != d));
        System.out.println(a + " == " + c + ": " + (a == c));
        System.out.println(a + " >= " + c + ": " + (a >= c));
        System.out.println(b + " > " + d + ": " + (b > d));
        System.out.println(d + " == " + e + ": " + (d == e));

    }

    public static void compareDifferentStrings() {
        // create 2 different strings and compare them using ternary operator;
        //print "not equal" / "equal"
        System.out.println("COMPARING STRINGS");
        String x = "Test string";
        String y = "Another test string";
        String res = (x.equals(y)) ? "equal" : "not equal";
        System.out.println("String " + x + " and string " + y + " are " + res);
    }

    public static void testLogicalOperators() {
        //provide examples ||,&&,|,&
        System.out.println("TESTING LOGICAL OPERATORS");
        int age = 19;
        boolean hasCoupon = true;
        if (age <= 6 || hasCoupon)
            System.out.println("Ticket price: free");
        else if (age > 6 && age <= 14)
            System.out.println("Ticket price: $5");
        else
            System.out.println("Ticket price: $8");
    }

    public static void testLogicalAND() {
        //difference between && and &
        int x = 5, y = 7, z = 9;
        System.out.println("Demonstrating && operator");
        if ((x > y) && (x++ > z)) ; // does not evaluate the second statement if the first one is not true
        System.out.println("Value of x: " + x);
        System.out.println("Demonstrating & operator");
        if ((x > y) & (x++ > z)) ; // evaluates all the statements
        System.out.println("Value of x: " + x);
    }

    public static void testBitwiseOperators() {
        System.out.println("TESTING BITWISE OPERATORS");
        int y = 5, z = 7;
        // | - Bitwise OR - returns bit by bit OR of input values
        System.out.println(y + "|" + z + " = " + (y | z));
        // & - Bitwise AND - returns bit by bit AND of input values
        System.out.println(y + "&" + z + " = " + (y & z));
    }

    public static void testCaseCondition() {
        //case condition
        System.out.println("TESTING CASE CONDITION");
        int day = 5;
        String dayString;
        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
        }
        System.out.println(dayString);
    }

    public static void compareSameValueStrings() {
        System.out.println("COMPARING STRINGS");
        String x = "wibbly wobbly timey wimey";
        String y = new String("wibbly wobbly timey wimey");
        String res1 = (x.equals(y)) ? "equal" : "not equal";
        System.out.println("String " + x + " and string " + y + " are " + res1);
        String res2 = (x == y) ? "equal" : "not equal";
        System.out.println("String references are " + res2);
    }

    public static void main(String args[]) {
        compareBooleans();
        compareNumericValues();
        testLogicalOperators();
        testLogicalAND();
        testBitwiseOperators();
        testCaseCondition();
        compareDifferentStrings();
        compareSameValueStrings();
    }
}