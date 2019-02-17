package com.Stream.Eight;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    // reduce
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,1,1);
        Integer reduced = integers.stream().reduce(3, (fromIdentity, fromList)->fromIdentity+fromList);
        System.out.println(reduced);
    }
}
