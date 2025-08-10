package dAY6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

    public static void readFile(String filename) throws FileNotFoundException, IOException
    {
       
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) 
        {
            String firstLine = br.readLine();
            System.out.println("First line: " + firstLine);
        }
    }

    public static void main(String[] args) 
    {
        String filename = "Music.text";  

        try {
            readFile(filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            System.out.println("Cleanup done.");
        }
    }
}
