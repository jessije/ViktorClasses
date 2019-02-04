package com.Feb4.Banks.drinker;

public class ItWorker  extends Worker{

    public ItWorker(String name, String position, String company) {
        this.company = company;
        this.name = name;
        this.position = position;
    }

    @Override
    public void workHard() {
        System.out.println("Do java");

    }
}
