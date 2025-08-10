package day10;

import java.io.FileWriter;
import java.io.IOException;

public class HelloWorldFile {
    public static void main(String[] args) {
        try {
           
            FileWriter writer = new FileWriter("hello.txt");

            writer.write("Hello, World!");

            writer.close();
            System.out.println("Successfully wrote to hello.txt");
        } 
        catch (IOException e)
        {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

