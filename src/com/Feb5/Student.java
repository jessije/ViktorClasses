package com.Feb5;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String[] array = {"Lena", "Mohsen", "Dmitri", "Roman"};
        StudentMethod studentMethod = new StudentMethod();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        try {
            studentMethod.checkName(name, array);

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }


    }
}

