package com.Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Testing4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int nextInt = scanner.nextInt();
        while (nextInt!=0){
            set.add(nextInt);
            nextInt=scanner.nextInt();
        }
        System.out.println(set);
    }
    }

