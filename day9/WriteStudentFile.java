package day9;

import java.io.FileWriter;
import java.io.IOException;

public class WriteStudentFile {
    public static void main(String[] args) 
    {
        String fileName = "student.txt";

        try 
        {
            
            FileWriter writer = new FileWriter(fileName);

            writer.write("Lakshman\n");
            writer.write("Prudhvi\n");
            writer.write("Suvin\n");
            writer.write("John\n");
            writer.write("David\n");

            writer.close();

            System.out.println("File '" + fileName + "' created and student names written successfully.");
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

