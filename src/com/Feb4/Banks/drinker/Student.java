package com.Feb4.Banks.drinker;

public abstract class Student implements Drinker, Disabled {

    String name;

    int age;

    String interest;

    public abstract void passExam();

    @Override
    public void drink() {
        System.out.println("Drinking");
    }

    public void learn(String topic) {
        System.out.println("Learning complete");
    }
}
