package day10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) 
    {
        String sourceFile = "hello.txt";    
        String destFile = "student.txt"; 

        FileReader fr = null;
        FileWriter fw = null;

        try 
        {
            fr = new FileReader(sourceFile);
            fw = new FileWriter(destFile);

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            System.out.println("File copied successfully.");

        } 
        catch (IOException e) 
        {
            System.out.println("Error occurred: " + e.getMessage());
        } 
        finally
        {
            try 
            {
                if (fr != null) fr.close();
                if (fw != null) fw.close();
            } 
            catch (IOException e) 
            {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
}
