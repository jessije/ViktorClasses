package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {

    //create streams
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");
        Stream<String> streamList = names.stream();
        streamList.forEach(System.out::println);
    }
}
