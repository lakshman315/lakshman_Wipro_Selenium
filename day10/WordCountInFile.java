package day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCountInFile {
    public static void main(String[] args) {
        
        String filename = "student.txt";
        String wordToFind = "Lakshman";

        int count = 0;

        try (Scanner fileScanner = new Scanner(new File(filename))) 
        {
           
            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                word = word.replaceAll("\\W", "");
                if (word.equalsIgnoreCase(wordToFind)) 
                {
                    count++;
                }
            }
            System.out.println("The word '" + wordToFind + "' occurred " + count + " times in the file.");
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found: " + filename);
        }
    }
}

