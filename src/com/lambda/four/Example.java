package com.lambda.four;


import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.function.Function;

public class Example {
    public static void main(String[] args) {

        Function<String, Integer> calculateLength = s -> s.length();
        System.out.println(calculateLength.apply("Hello world"));

        Function<Integer, Integer> addMeNumbers = integer -> integer+3;
        System.out.println(addMeNumbers.apply(5));
    }
}
