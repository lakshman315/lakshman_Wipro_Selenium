package day9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordLineCount {
    public static void main(String[] args) {
        String fileName = "student.txt";
        int lineCount = 0;
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) 
        {
            String line;
            
            while ((line = br.readLine()) != null) 
            {
                lineCount++;
                
                String[] words = line.trim().split("\\s+");
                
                if (!line.trim().isEmpty()) 
                {
                    wordCount += words.length;
                }
            }

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);

        }
        catch (IOException e) 
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
