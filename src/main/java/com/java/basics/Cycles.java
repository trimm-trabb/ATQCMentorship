package com.java.basics;

public class Cycles {

    public static int factorial(int n) {
        // create recursion with exit condition
        if (n <= 1)
            return n;
        return factorial(n - 1) * n;
    }

    public static int recursiveSum(int n) {
        // create recursion with no exit condition
        return recursiveSum(n - 1) + n;
    }

    public static void testForLoop() {
        //create for cycle that iterates 10 times and print iteration number to console
        System.out.println("TESTING FOR LOOP");
        int testArray[] = {25, 39, 3, -1, 4, 0, -789, 23, 98, 1000};
        for (int i = 0; i < testArray.length; i++) {
            System.out.println("Iteration number:" + (i + 1) + "; Element: " + testArray[i]);
        }
        //another for loop
        int i = 0;
        for (int j : testArray) {
            i++;
            System.out.println("Iteration number:" + i + "; Element: " + j);
        }
    }

    public static void testWhileLoop() {
        //create while cycle that iterates 10 times and print iteration number to console
        System.out.println("TESTING WHILE LOOP");
        int x = 1;
        int sum = 0;
        int i = 0;
        while (x <= 10) {
            sum += x;
            x++;
            i++;
            System.out.println("Iteration number: " + (i));
        }
        System.out.println("Total sum: " + sum);
    }

    public static void testDoWhileLoop() {
        System.out.println("TESTING DO WHILE LOOP");
        int x = 10;
        int sum = 0;
        int i = 0;
        do {
            sum += x;
            x--;
            i++;
            System.out.println("Iteration number: " + (i));
        }
        while (x >= 1);
        System.out.println("Total sum: " + sum);
    }

    public static void testInfiniteLoop() {
        int z = 10;
        while (z > 0) {
            z++;
            System.out.println(z);
        }
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println("Factorial of " + n + " is " + factorial(n));
        //System.out.println(recursiveSum(n)); //commented due to no exit condition
        testDoWhileLoop();
        testForLoop();
        testWhileLoop();
        //testInfiniteLoop(); //commented due to no exit condition
    }
}