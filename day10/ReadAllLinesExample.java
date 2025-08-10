package day10;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class ReadAllLinesExample {
    public static void main(String[] args) {
        Path filePath = Paths.get("student.txt");

        try 
        {
            
            List<String> lines = Files.readAllLines(filePath);

            for (String line : lines) 
            {
                System.out.println(line);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

