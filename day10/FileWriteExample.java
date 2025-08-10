package day10;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) 
    {
        Path filePath = Paths.get("example.txt");

        String dataToWrite = "Hello, World!\n";
        
        try 
        {          
            Files.write(filePath, dataToWrite.getBytes());
            System.out.println("Data written to file: " + filePath.toString());
        } 
        catch (IOException e)
        {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        String dataToAppend = "Appending this line.\n";

        try 
        {
            Files.write(filePath, dataToAppend.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Data appended to file: " + filePath.toString());
        }
        catch (IOException e) 
        {
            System.err.println("Error appending to file: " + e.getMessage());
        }
    }
}

