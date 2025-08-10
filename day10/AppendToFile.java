package day10;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        String filePath = "example.txt";  
        String textToAppend = "This is the new line to append.";

        try (FileWriter fw = new FileWriter(filePath, true))
        { 
            fw.write(textToAppend + System.lineSeparator());
            System.out.println("Line appended successfully.");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }
}

