package com.lambda.three;

import java.util.function.Predicate;

public class Person  {
    private int age;
    private String name;
    private String gender;

    public Person(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public boolean isAdult() {
        return age>18;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
    private static Predicate<Person> isAdultMale() {
        return person -> person.getGender().equalsIgnoreCase("m") && person.getAge() > 18;

    }



}
