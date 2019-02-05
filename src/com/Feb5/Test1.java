package com.Feb5;

import javax.naming.LinkException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {


        try {
            doSomethingElse();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }catch(LinkException a){
            System.out.println("done");
        }
    }

    static void doSomethingElse() throws CustomException, LinkException {
        doDividing();
        throw new LinkException();
    }

    static void doDividing() throws CustomException {

        int a = 100;
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value == 0) {
            throw new CustomException("division by zero is bad ");
        }
        int result = a/value;
        System.out.println(result);
    }
}
