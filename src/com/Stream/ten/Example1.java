package com.Stream.ten;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args)  {
        //Print even number of a list from 1-10
        List<Integer> integer = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = integer.stream();
        List<Integer> evenNumberList = stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenNumberList);

    }
}
