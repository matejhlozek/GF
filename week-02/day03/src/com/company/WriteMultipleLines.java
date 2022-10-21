package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {
        writeMultipleLines();
    }

    public static void writeMultipleLines() {
        Path filePath = Paths.get("my-file.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter word");
        String word = scanner.nextLine();
        String line = "\n" + word;
        try {
            for (int i = 0; i < word.length(); i++) {
                Files.writeString(filePath, line, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}

