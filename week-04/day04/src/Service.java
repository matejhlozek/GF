import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Service {

    public void printHelp() {
        Path path = Paths.get("Info");
        List<String> infoFileContent = new ArrayList<>();
        try {
            infoFileContent = Files.readAllLines(path);
        } catch (IOException exception) {
            System.err.println("Sorry instructions ar not available.");
        }
        for (String line : infoFileContent) {
            System.out.println(line);
        }
    }

    public List<String> readFile(String filePath) {
        Path path = Paths.get(filePath);
        List<String> fileContent = new ArrayList<>();
        try {
            fileContent = Files.readAllLines(path);
        } catch (IOException exception) {
            System.err.println("Sorry, file is not available.");
        }
        return fileContent;
    }

    public void printTask() {
        List<String> fileContent = readFile("TodoList");
        if (!fileContent.isEmpty()) {
            for (String line : fileContent) {
                System.out.println(line);
            }
        } else System.out.println("No todos for today! :)");
    }

    public void addTask(String newTask) {
        List<String> fileContent = readFile("TodoList");
        fileContent.add(newTask);
        try {
            Files.write(Paths.get("TodoList"), fileContent);
        } catch (IOException e) {
            System.out.println("Couldn't write to a file");
        }
        System.out.println(newTask + " added");
    }

    public void removeTask(String intAsString) {
        List<String> fileContent = readFile("TodoList");
        int index = Integer.valueOf(intAsString);
        fileContent.remove(index - 1);
        try {
            Files.write(Paths.get("TodoList"), fileContent);
        } catch (IOException e) {
            System.out.println("Couldn't write to a file");
        }
        System.out.println(index + " removed");
    }
}
