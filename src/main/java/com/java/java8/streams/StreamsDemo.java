package com.java.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("cat", "dog", "q10", "light", "red", "book",
                "coffee", "banana", "car", "sea");

        //Loop down the words and print each on a separate line, with two spaces in front of each word.
        //Don’t use map
        words.stream().forEach(c -> System.out.println("  " + c));

        // using streams and the built in “map” method produce the following lists:
        // a) add "!" to each word; b) replace 'i' with 'eye' in each word; c) capitalize all words
        List<String> words1 = words.stream().map(c -> c + "!").collect(Collectors.toList());
        System.out.println(words1);
        List<String> words2 = words.stream().map(c -> c.replace("i", "eye")).collect(Collectors.toList());
        System.out.println(words2);
        List<String> words3 = words.stream().map(c -> c.toUpperCase()).collect(Collectors.toList());
        System.out.println(words3);

        //Turn the strings into uppercase, keep only the ones that are shorter than 4 characters, of what is
        //remaining, keep only the ones that contain “E”, and print the first result.
        words.stream().map(c -> c.toUpperCase()).filter(c -> c.length() < 4).filter(c ->
                c.contains(Character.toString('E'))).forEach(c -> System.out.println(c));

        //Repeat the process, except checking for a “Q” instead of an “E”. When checking for the “Q”,
        // try to avoid repeating all the code from when you checked for an “E”.
        words.stream().map(c -> c.toUpperCase()).filter(c -> c.length() < 4 &&
                c.contains(Character.toString('Q'))).forEach(c -> System.out.println(c));
    }
}