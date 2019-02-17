package com.Stream.ten;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example6 {
    //convert list to map
    //gets list of animal
    //convert list ot map, id is key, object is a value
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(1,"cat"));
        animals.add(new Animal(2,"dog"));
        animals.add(new Animal(3,"cow"));
        animals.add(new Animal(4,"zebra"));
        System.out.println(convertListAfterJava8(animals));
    }
    public static Map<Integer, Animal> convertListAfterJava8 (List<Animal> list){
        Map<Integer, Animal> map = list.stream().collect(Collectors.toMap(Animal::getId, animal->animal));
        return map;
    }

}
