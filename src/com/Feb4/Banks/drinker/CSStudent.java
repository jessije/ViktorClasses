package com.Feb4.Banks.drinker;

public class CSStudent extends Student {

    public CSStudent(String name, int age, String interest) {
        this.age = age;
        this.name = name;
        this.interest = interest;
    }

    @Override
    public void passExam() {
        System.out.println("Passed");
    }

    @Override
    public void rolling() {

    }
}
