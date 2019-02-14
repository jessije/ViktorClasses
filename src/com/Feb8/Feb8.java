package com.Feb8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
//NEW I/O - DIRECTORIES
public class Feb8 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("test.txt");
        List<String> list =  new ArrayList<>();
        list.add("Basaran1");
        list.add("Basaran2");
        list.add("Basaran3");
        list.add("Basaran4");

        Files.write(path,list, StandardOpenOption.APPEND);
        }
    }


