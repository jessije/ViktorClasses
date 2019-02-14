package com.FerideClaases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example {
    public static void main(String[] args) throws IOException {
        String fileLocation = "C:/Users/jessi/OneDrive/Desktop/lines.txt";
        try {
            List<String> lines = Files.
                    readAllLines(Paths.get(fileLocation), Charset.forName("UTF-8"));
            for (String line : lines) {
                System.out.println(line);
            }
            Set<String> myUniqueElements = new HashSet<>(lines);
            System.out.println(myUniqueElements);
        } catch(FileNotFoundException fne){
            System.out.println("file not found");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
