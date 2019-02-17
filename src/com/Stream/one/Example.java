package com.Stream.one;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

    //create streams
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael"); // use debug to see why it is in line
        Stream<String> streamList = names.stream();
        streamList.forEach(System.out::println);

        Stream<String> stream = Stream.of("a", "b", "y");
        stream.forEach(System.out::println);


        Set<String> set = names.stream().collect(Collectors.toSet());
        set.forEach(System.out::println);
    }
}