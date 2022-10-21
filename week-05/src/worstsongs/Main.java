package worstsongs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Path filePath = Paths.get("src/100worst.csv");

        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(filePath);
        } catch (IOException exception) {
            System.out.println("File reading was unsuccessful!");
            exception.printStackTrace();
            System.exit(1);
        }

        List<String> years = new ArrayList<>();

        String number;
        for (String line : content) {
            String[] splitLine = line.split(";");
            number = splitLine[3];
            years.add(number);
        }

        int max = 0;
        String worstYear = "";
        for (int i = 0; i < years.size(); i++) {
            int count = 1;
            for (int j = 0; j < years.size(); j++) {
                if (years.get(i).equals(years.get(j))) {
                    count++;
                }
            }
            if (max < count) {
                max = count;
                worstYear = years.get(i);
            }
        }
        System.out.println(years);
        System.out.println(worstYear);
    }

}
