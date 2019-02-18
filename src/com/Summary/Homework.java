package com.Summary;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Homework {
    // Create a class named Person - String firstName, String lastName, Country country, int age
    // Create a class named Country - boolean eu
    // Read csv file and create streams with suitable classes.
    // Create a class has these methods : findAll, findPersonByName, findPersonByLastName,
    // isPersonEuCitizen,getAverageAge

    //Please consider to use the topics we covered so far!!!!!

    //Hint : Interface, enum, collections, streams, functions, lambda, file operations, filtering

    // I will publish the solution after one week or so. If I don't please ping me via Slack.
    // Also the next topic is TDD, we are going to go forward with this example and write tests
    public static void main(String[] args) throws IOException {
        String fileLocation = "C:/Users/jessi/OneDrive/Desktop/people.csv";
        try {
            List<String> people = Files.
                readAllLines(Paths.get(fileLocation), Charset.forName("UTF-8"));
            for (String line : people) {
                System.out.println(line);
            }
//            Stream<String> streamList = people.stream();
//            streamList.forEach(System.out::println);

        } catch (FileNotFoundException fne) {
            System.out.println("file not found");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
            //group by Country, return a map , it has key and value relation,
                      //key will be country, value will be people, use groupby (collectors to map)
            //search by Name
            // get average

        }
    }
}

