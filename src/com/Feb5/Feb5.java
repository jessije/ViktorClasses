package com.Feb5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Feb5 {
    public static void main(String[] args) {
        int var = 100;
        Scanner scanner = new Scanner(System.in);


        try {
            int value = scanner.nextInt();
            int result = var / value;
            System.out.println(result);
        } catch (ArithmeticException b) {
            System.out.println(b);
            //System.out.println(b);<--to avoid null
        }catch(InputMismatchException b){
            System.out.println("unable to read with the exception" + b);
        }
    }

    static void doDividing(){

    }
}

