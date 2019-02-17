package com.Stream.six;

import java.util.*;

public class Example {
    //stream mapToInt
    //stream mapToDouble
    public static void main(String[] args) {
            List<String> names = Arrays.asList("Andrew", "Brandon", "Lena");
        OptionalDouble averageNameLenghtOptional = names.stream().mapToInt(String::length).average();
        averageNameLenghtOptional.ifPresent(System.out::println);
    }
}
