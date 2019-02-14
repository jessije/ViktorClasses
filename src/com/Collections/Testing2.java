package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class Testing2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int newElement = (int) (Math.random() * 10);
            list.add(newElement);
        }

        System.out.println(list);
        List<Integer> list1 = new ArrayList<>();
        for (Integer integer : list) {
            if (!list1.contains(integer)) {
                list1.add(integer);
            }
        }
        System.out.println(list1);


    }
}
