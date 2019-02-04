package com.Feb4.Banks;

public class LHVbank extends Bank {

    public LHVbank(String name){
        this.name = name;
        this.amountCustomers = 0;
    }
    @Override

    public void openAccount(){
        System.out.println("Opening in LHV");
        this.amountCustomers+=1;
    }
}
