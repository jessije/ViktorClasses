package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Testing5 {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int nextNumber = scanner.nextInt();
        while (nextNumber != 0) {
            map.put(nextNumber, map.getOrDefault(nextNumber, 0) + 1);
            nextNumber = scanner.nextInt();
        }
        System.out.println(map);
    }
}
