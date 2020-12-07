package com.java.basics.dto;

import java.io.Serializable;

public class Person implements java.io.Serializable {

    private String name;
    private transient int age;
    private String car;

    public Person() {
    }

    public Person(String name, int age, String car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getCar() {
        return this.car;
    }

    public String toString() {
        return this.getName() + " " + this.getAge() + " " + this.getCar();
    }
}