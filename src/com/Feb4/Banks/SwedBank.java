package com.Feb4.Banks;

public class SwedBank extends Bank {

    public SwedBank(String name) {

        this.name = name;
        this.amountCustomers = 0;
    }

    @Override

    public void openAccount() {
        if (amountCustomers > 4) {
            System.out.println("sorry");

        } else {
            System.out.println("opening account at swed");
            this.amountCustomers += 1;
        }
    }
}
