package day9;

import java.io.*;
import java.util.Scanner;

public class WordSearchInFile {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the word to search: ");
        String wordToSearch = sc.nextLine();

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader("student.txt"))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                if (line.toLowerCase().contains(wordToSearch.toLowerCase())) 
                {
                    found = true;
                    break;
                }
            }
        } 
        catch (IOException e)
        {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        if (found)
        {
            System.out.println("The word \"" + wordToSearch + "\" exists in the file.");
        } 
        else 
        {
            System.out.println("The word \"" + wordToSearch + "\" was not found in the file.");
        }
    }
}

