package com.java.basics;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.basics.dto.Person;

public class JsonConvertion {

    private static Person parseWithGson(String jsonString) {
        Gson gson = new Gson();
        Person p = gson.fromJson(jsonString, Person.class);
        return p;
    }

    private static Person parseWithJackson(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        Person p = null;
        try {
            p = mapper.readValue(jsonString, Person.class);
        } catch (JsonProcessingException e) {
            System.out.println("JsonProcessingException is caught");
        }
        return p;
    }

    public static void main(String[] args) {
        String jsonString = "{ \"name\":\"John\", \"age\":30, \"car\":null }";
        Person p1 = parseWithGson(jsonString);
        System.out.println(p1.getName() + " " + p1.getAge());
        Person p2 = parseWithJackson(jsonString);
        System.out.println(p2.getName() + " " + p2.getAge());
    }
}