package com.Collections;

import java.util.*;

public class Testing3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int newElement = (int) (Math.random() * 10);
            list.add(newElement);
        }

        System.out.println(list);

        for(int counter = 0; counter <list.size(); counter++) {
            int counter1 = 0;
           if(list.contains(counter)){
               counter1++;


            }

        }
    }
}
