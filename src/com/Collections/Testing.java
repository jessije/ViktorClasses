package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        Integer integer = list.get(0);
        list.remove(0);
        list.size();
        for(Integer i : list){
            System.out.println(i);
        }
        for(int i=0;i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }


}
