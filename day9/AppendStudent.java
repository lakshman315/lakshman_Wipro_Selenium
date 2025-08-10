package day9;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendStudent {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter new student name: ");
        String studentName = sc.nextLine();
        
        try 
        {
            
            FileWriter fw = new FileWriter("student.txt", true);
            fw.write(studentName + "\n");
            fw.close();
            System.out.println("Student name appended successfully.");
        } 
        catch (IOException e)
        {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
        
        sc.close();
    }
}

