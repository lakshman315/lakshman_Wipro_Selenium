package day9;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInputToFile
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("userinput.txt");

            System.out.println("Enter text to write to the file (type 'exit' to stop):");

            while (true) 
            {
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("exit"))
                {
                    break; 
                }
                writer.write(input + System.lineSeparator()); 
            }

            writer.close();
            System.out.println("Data successfully written to userinput.txt");

        } 
        catch (IOException e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        } 
        finally 
        {
            sc.close();
        }
    }
}
