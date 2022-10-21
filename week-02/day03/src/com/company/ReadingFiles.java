package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadingFiles {
    public static void main(String[] args) {
            Path filePath = Paths.get("lorem-ipsum.txt");
            try {
                List<String> lines = Files.readAllLines(filePath);
                System.out.println(lines.get(0));
            } catch (IOException e) {
                System.out.println("Uh-oh, could not read the file!");
            }
        }
    }