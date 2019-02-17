package com.Stream.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
 //streams map method

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Lena", "Andrew");
        System.out.println(names);
        List namesLengths = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println(namesLengths);
    }
}
