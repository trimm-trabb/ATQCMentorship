package com.java.oop.constructorsdemo;

public class ClassA {

    private int age;
    private String name;

    public ClassA(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public ClassA() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "age: " + age + " name: " + name;
    }
}