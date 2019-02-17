package com.Stream.ten;

import java.util.stream.Stream;

public class Example5 {
    public static void main(String[] args) {
        Stream.of("a1", "b2", "c3")
            .map(s -> s.substring(1))
            .mapToInt(Integer::parseInt)
            .max()
            .ifPresent(System.out::println);
    }
}
