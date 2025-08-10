package day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileTokens {
    public static void main(String[] args) 
    {
      
        String filePath = "student.txt";

        try 
        {
            File file = new File(filePath);
            Scanner sc = new Scanner(file);

            System.out.println("Tokens in the file:");

            while (sc.hasNext()) 
            {
                String token = sc.next();
                System.out.println(token);
            }

            sc.close();
        }
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found: " + filePath);
        }
    }
}
