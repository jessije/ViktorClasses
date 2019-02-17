package com.Stream.two;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example {
    //convert stream to the other collection
    //list set map
    public static void main(String[] args) {
        List<String > names = Arrays.asList("Andrew", "Brandon", "Lena", "Andrew");
        System.out.println(names);

        Set<String> namesCopy = names.stream().collect(Collectors.toSet());
        namesCopy.forEach(System.out::println);
    }
}
