package com.Stream.seven;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Example {

    // - allMatch allMatch, anyMatch any Match, noneMatch
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Lena");
        boolean allNamesLengthIsGtThan3 = names.stream().allMatch(name-> name.length() > 3);
        System.out.println("All names length greater than 3: " + allNamesLengthIsGtThan3);
        boolean thereIsNameWhichLengthIsGtThan3 = names.stream().anyMatch(n-> n.length() >3);
        System.out.println("At least one element's length grater than 3: "+thereIsNameWhichLengthIsGtThan3);

    }
}
