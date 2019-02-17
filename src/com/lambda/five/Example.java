package com.lambda.five;

import com.lambda.three.Person;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        Person adultPerson = new Person(43, "Feride", "f");
        Predicate<Person> adultPersonTest = Person::isAdult;
        System.out.println(adultPersonTest.test(adultPerson));

    }
}
