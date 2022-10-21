package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {

        List<String> myList = readFile("my-file.txt");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    public static List<String> readFile(String file) {
        Path filePath = Paths.get(file);
        List<String> fileContent = null;
        try {
            fileContent = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.err.println("Unable to read file");
        }
        return fileContent;

    }

}