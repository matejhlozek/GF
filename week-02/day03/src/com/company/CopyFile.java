package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {



    public static void main(String[] args)
    {
        File from = new File("my-filee.txt");
        File to = new File("my-file2.txt");

        try {
            copyFile(from, to);
            System.out.println(true);
        }
        catch (IOException ex) {
            ex.printStackTrace();
            System.out.println(false);
        }

    }

    public static void copyFile(File src, File dest) throws IOException {
        Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);


    }
}
