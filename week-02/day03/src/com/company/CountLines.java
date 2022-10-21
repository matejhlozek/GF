package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
    countLines();
        System.out.println(countLines());
    }
    public static int countLines() {
        Path filePath = Paths.get("my-file.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            return lines.size();
        } catch (IOException e) {
            return 0;
        }
    }
}