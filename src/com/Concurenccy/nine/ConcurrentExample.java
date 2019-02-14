package com.Concurenccy.nine;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentExample {
    public static void main(String[] args) {
        Map<Integer, String> nonThreadSafeMap = new HashMap<>();
        nonThreadSafeMap.put(1,"Adam");
        nonThreadSafeMap.put(2, "John");
        nonThreadSafeMap.put(3,"Michael");
        System.out.println("Map without sunchronization");
        System.out.println(nonThreadSafeMap);

        Map<Integer, String> synchronizedMap =Collections.synchronizedMap(nonThreadSafeMap);
        System.out.println("Map after synchronization");
        System.out.println(synchronizedMap);

        Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1,"Adam");
        concurrentHashMap.put(2, "John");
        concurrentHashMap.put(3,"Michael");

        System.out.println(concurrentHashMap);


    }
}
