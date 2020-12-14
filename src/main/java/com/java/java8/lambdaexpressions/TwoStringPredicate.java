package com.java.java8.lambdaexpressions;

@FunctionalInterface
interface TwoStringPredicate {

    boolean compareStrings(String s1, String s2);
}