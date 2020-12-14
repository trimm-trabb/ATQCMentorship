package com.java.java8.lambdaexpressions;

import java.util.Arrays;

public class LambdaExpressionsDemo {

    //helper method to sort strings
    private static int sortByECharacter(String s1, String s2) {
        boolean a = s1.contains(Character.toString('e'));
        boolean b = s2.contains(Character.toString('e'));
        if (a && b)
            return 0;
        if (a)
            return -1;
        if (b)
            return 1;
        return 0;
    }

    // returns string1 if the method in interface returns true, string2 otherwise
    public static String betterString(String s1, String s2, TwoStringPredicate i) {
        return i.compareStrings(s1, s2) ? s1 : s2;
    }

    public static void main(String[] args) {
        String[] cities = {"London", "Rome", "Tokyo", "Stockholm", "Rio de Janeiro", "Berlin", "Venice",
                "Washington", "Lima", "Oslo"};

        System.out.println("Sorted by length asc:");
        Arrays.sort(cities,
                (c1, c2) -> c1.length() - c2.length());
        System.out.println(Arrays.asList(cities));

        System.out.println("Sorted by length desc:");
        Arrays.sort(cities,
                (c1, c2) -> c2.length() - c1.length());
        System.out.println(Arrays.asList(cities));

        System.out.println("Sorted alphabetically by the first character only:");
        Arrays.sort(cities,
                (c1, c2) -> c1.charAt(0) - c2.charAt(0));
        System.out.println(Arrays.asList(cities));

        System.out.println("Strings that contain “e” first, everything else second:");
        Arrays.sort(cities, (c1, c2) -> {
                    boolean a = c1.contains(Character.toString('e'));
                    boolean b = c2.contains(Character.toString('e'));
                    if (a && b)
                        return 0;
                    if (a)
                        return -1;
                    if (b)
                        return 1;
                    return 0;
                }
        );
        System.out.println(Arrays.asList(cities));

        System.out.println("Strings that contain “e” first, everything else second:");
        Arrays.sort(cities,
                (c1, c2) -> sortByECharacter(c1, c2));
        System.out.println(Arrays.asList(cities));

        //find "better" string
        String longer = betterString("Oslo", "Copenhagen", (c1, c2) -> c1.length() > c2.length());
        System.out.println("Longer string: " + longer);
    }
}