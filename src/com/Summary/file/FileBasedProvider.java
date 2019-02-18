package com.Summary.file;

import com.Summary.data.Country;
import com.Summary.data.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileBasedProvider implements PersonDataProvider {
    @Override
    public Collection<Person> findAll() {
        return myPeople;
    }

    @Override
    public Collection<Person> search(String firstName, String lastName, Boolean eu, int minimumAge) {
        Stream<Person> peopleStream = myPeople.stream();

        if(firstName!=null)
            peopleStream = peopleStream.filter(person -> person.getFirstName().equals(firstName));
        if(lastName!=null)
            peopleStream = peopleStream.filter(person -> person.getLastName().equals(lastName));
        if(minimumAge>0)
            peopleStream = peopleStream.filter(person -> person.getAge()>=minimumAge);
        if(eu!=null)
            peopleStream = peopleStream.filter(person -> person.getCountry().isEu() == eu.booleanValue());
        return peopleStream.collect(Collectors.toList());
    }

    private Function<String, Person> mapToItem = (line) -> {
        String[] p = line.split(","); //a CSV has comma separated lines
        Person person = new Person(p[0], p[1], Country.valueOf(p[2]), Integer.parseInt(p[3]));
        return person;
    };
    private static List<Person> myPeople = new ArrayList<>();
    private void read(File file) throws IOException {
        //todo task-1: read content of the given file
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            myPeople = br.lines().skip(1).map(mapToItem).collect(Collectors.toList());
        }catch (IOException e){
            throw new IOException("not implemented: "+e);
        }
    }
    //group by Country, return a map , it has key and value relation,
    //key will be country, value will be people, use groupby (collectors to map)
    //search by Name
    // get average age


}