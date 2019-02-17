package com.Stream.Eight;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    // streams - reduce method
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew","","Brandon", "Lena");
        String namesConcatenation = names.stream().reduce("", (currValue, element) -> (currValue.equals("") ? "" : currValue + ".") + element);
        System.out.println(namesConcatenation);
        System.out.println(10>3? "10 is bigger than three":"10 is not bigger than 3");
    }
}
