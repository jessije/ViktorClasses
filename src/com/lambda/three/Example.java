package com.lambda.three;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        Person adultPerson = new Person(30, "lena", "f");

        Predicate<Person> adultPersonTestWithLambda = person -> person.getAge() > 18;
        System.out.println(adultPersonTestWithLambda.test(adultPerson));
        System.out.println(isAdultMale().test(adultPerson));
        System.out.println(checkAge(70).test(adultPerson));
        System.out.println(isAdultFemale().and(checkAge(60)).test(adultPerson)); //we can combine more than one predicate with or and and
        System.out.println(isAdultMale().or(checkAge(60)).test(adultPerson));
    }

    private static Predicate<Person> isAdultMale() {
        return person -> person.getGender().equalsIgnoreCase("m") && person.getAge() > 18;

    }

    private static Predicate<Person> checkAge(Integer age) {
        return person -> person.getAge() > age;

    }

    private static Predicate<Person> isAdultFemale() {
        return person -> person.getGender().equalsIgnoreCase("f");
    }
}
