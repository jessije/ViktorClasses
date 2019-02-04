package com.Feb4.Banks.drinker;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student = new CSStudent("Jon", 21, "java");
        Worker itWorker = new ItWorker("James", "Java Developer", "Google");

        List<Drinker> drinkers = new ArrayList<>();
        drinkers.add(student);
        drinkers.add(itWorker);

        goDrink(drinkers);

    }

    static void goDrink(List<Drinker> drinkers) {
        for (Drinker drinker: drinkers) {
            drinker.drink();
        }
    }

}
