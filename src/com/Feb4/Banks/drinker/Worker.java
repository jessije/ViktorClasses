package com.Feb4.Banks.drinker;

public abstract class Worker implements Drinker {
    String name;

    String position;

    String company;

    public abstract void  workHard();

    @Override
    public void drink() {
        System.out.println("Worker is partying hard");
    }

    public void beingHappy() {
        System.out.println(":)");
    }
}
