package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {
    writeSingleLine();
    }

    public static void writeSingleLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = scanner.nextLine();
        Path filePath = Paths.get("my-file.txt");
        String line = "\n" + name;
        try {
                Files.writeString(filePath, line, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            System.out.println("Unable to write file: my-file.txt");
            }
        }
    }

