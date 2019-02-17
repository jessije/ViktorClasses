package com.Stream.Eight;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Example3 {
    //find 5! (factorial)
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> intOptional = numbers.reduce((i, j) -> {return i * j;});
        if (intOptional.isPresent())
            System.out.println("Multiplication = " + intOptional.get());
    }
}
