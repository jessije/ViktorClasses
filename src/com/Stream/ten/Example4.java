package com.Stream.ten;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example4 {
    //sum all elements greater than 10 in the list
    public static void main(String[] args) {
        Integer numArr[] = new Integer[] {10,20,30,40};
        List<Integer> numList = Arrays.asList(numArr);
        System.out.println(sumStream(numList));
    }
    private static int sumStream (List<Integer>list){
       // List<Integer> greaterThanTen = Stream.filter(i->i>10).collect(Collectors.toList())
        return list.stream().filter(integer -> integer>10).mapToInt(number->number).sum();
    }
}
