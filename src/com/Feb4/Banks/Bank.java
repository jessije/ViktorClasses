package com.Feb4.Banks;

public abstract class Bank {
    String name;
    int amountCustomers;
    public abstract void openAccount();
    public void printInformation(){
        System.out.println(name);
        System.out.println("amount of custmers: "+ amountCustomers);
    }

}
