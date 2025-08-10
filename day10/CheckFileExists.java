package day10;

import java.io.File;
import java.util.Scanner;

public class CheckFileExists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = sc.nextLine();

        File file = new File(filePath);

        if (file.exists()) 
        {
            System.out.println("The file exists.");
        } 
        else 
        {
            System.out.println("The file does not exist.");
        }

        sc.close();
    }
}

