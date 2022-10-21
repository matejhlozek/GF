package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.PrintWriter;

public class Doubled {
    public static void main(String[] args) {
        doubled();
    }

    public static String doubled() {
        Path filePath = Paths.get("duplicated-chars.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                String allLines = lines.get(i);
                allLines = allLines + "\n";
                for (int j = 0; j < allLines.length() ; j+=2) {
                    System.out.print(allLines.charAt(j));
                }
                }
            }
         catch (IOException e) {
            System.out.println("Uh-oh, could not read the file!");
        } return null;
    }
}
