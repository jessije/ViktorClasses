package com.Feb5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        String[] array = {"one", "two", "three", "four", "five"};
        Scanner scanner = new Scanner(System.in);


        try {
            int index = scanner.nextInt();
            System.out.println(array[index]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
