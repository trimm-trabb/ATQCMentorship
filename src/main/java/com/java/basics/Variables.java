package com.java.basics;

public class Variables {

    public static void compareDifferentVariables() {
        //create int, double, long, float, string variables, assign different values and compare them
        int intVar = 5;
        long longVar = 243242432;
        double doubleVar = 45.98;
        float floatVar = 230.11f;
        String stringVar = "4354";
        System.out.println("COMPARING DIFFERENT VARIABLES");
        System.out.println(intVar + " == " + longVar + ": " + (intVar == longVar));
        System.out.println(longVar + " == " + doubleVar + ": " + (longVar == doubleVar));
        System.out.println(floatVar + " == " + stringVar + ": " + (stringVar.equals(floatVar)));
    }

    /*public static void compareUninitializedVariables() {
        //create int, double, long, float, string variables, don't assign any values and compare them
        //commented due to compile error
        int intVar;
        long longVar;
        double doubleVar;
        float floatVar;
        String stringVar;
        System.out.println ("COMPARING UNINITIALIZED VARIABLES");
        System.out.println (intVar + " == " + longVar + ": " + (intVar == longVar));
        System.out.println (longVar + " == " + doubleVar + ": " + (longVar == doubleVar));
        System.out.println (floatVar + " == " + stringVar + ": " + (stringVar.equals(floatVar)));
    }*/

    public static void compareVariablesSameValues() {
        //create int, double, long, float, string variables, assign the same values and compare them
        int intVar = 5;
        long longVar = 5;
        double doubleVar = 5;
        float floatVar = 5;
        String stringVar = "5";
        System.out.println("COMPARING VARIABLES WITH EQUAL VALUES");
        System.out.println(intVar + " == " + longVar + ": " + (intVar == longVar));
        System.out.println(longVar + " == " + doubleVar + ": " + (longVar == doubleVar));
        System.out.println(intVar + " == " + floatVar + ": " + (intVar == floatVar));
        System.out.println(floatVar + " == " + stringVar + ": " + (stringVar.equals(floatVar)));
        System.out.println(intVar + " == " + stringVar + ": " + (stringVar.equals(intVar)));
    }

    public static void compareFloatAndDouble() {
        //Assign in same order [0.5,0.7,1.0,0.1] values to float and double variables and compare them
        System.out.println("COMPARING FLOAT AND DOUBLE VARIABLES");
        double doubleArray[] = {0.5, 0.7, 1.0, 0.1};
        float floatArray[] = {0.5f, 0.7f, 1.0f, 0.1f};
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i] + " == " + floatArray[i] + ": " + (doubleArray[i] == floatArray[i]));
        }
    }

    public static void divideByZero() {
        //divide numeric values by zero
        System.out.println("TESTING DIVISION BY 0");
        int intVar = 5;
        long longVar = 243242432;
        double doubleVar = 23.45;
        float floatVar = 75.34f;
        //System.out.println (intVar + "/" + 0 + " = " + (intVar/0));
        //System.out.println (longVar + "/" + 0 + " = " + (longVar/0));
        System.out.println(doubleVar + "/" + 0 + " = " + (doubleVar / 0));
        System.out.println(floatVar + "/" + 0 + " = " + (floatVar / 0));
    }

    public static void divideByThree() {
        //divide numeric values by 3
        System.out.println("TESTING DIVISION BY 3");
        int intVar = 25;
        long longVar = 25;
        double doubleVar = 25;
        float floatVar = 25f;
        System.out.println(intVar + "/" + 3 + " = " + (intVar / 3));
        System.out.println(longVar + "/" + 3 + " = " + (longVar / 3));
        System.out.println(doubleVar + "/" + 3 + " = " + (doubleVar / 3));
        System.out.println(floatVar + "/" + 3 + " = " + (floatVar / 3));
    }

    public static void divideByThreeDouble() {
        System.out.println("TESTING DIVISION BY 3.0");
        int intVar = 25;
        long longVar = 25;
        double doubleVar = 25;
        float floatVar = 25f;
        System.out.println(intVar + "/" + 3.0 + " = " + (intVar / 3.0) + " = " + Math.round(intVar / 3.0 * 100) / 100.0);
        System.out.println(longVar + "/" + 3.0 + " = " + (longVar / 3.0) + " = " + Math.round(longVar / 3.0 * 100) / 100.0);
        System.out.println(doubleVar + "/" + 3.0 + " = " + (doubleVar / 3.0) + " = " + Math.round(doubleVar / 3.0 * 100) / 100.0);
        System.out.println(floatVar + "/" + 3.0 + " = " + (floatVar / 3.0) + " = " + Math.round(floatVar / 3.0 * 100) / 100.0);
    }

    public static void main(String args[]) {
        compareDifferentVariables();
        compareVariablesSameValues();
        compareFloatAndDouble();
        divideByZero();
        divideByThree();
        divideByThreeDouble();
    }
}