package com.Stream.nine;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example1 {
    //sorted method
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", "Smith", 20),
            new Person("Lena", "Esipko", 34));
        people.stream().sorted(
            (p1, p2) -> p1.getSurname().compareTo(p2.getSurname())).forEach(p-> System.out.println(p.getSurname()));
        System.out.println();
        //second option to print out
        people.stream().sorted(
            Comparator.comparing(Person::getSurname)).forEach(person -> System.out.println(person.getSurname()));

    }
}
