package day9;

import java.io.File;
import java.util.Scanner;

public class ListFilesOnly {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter folder path: ");
        String folderPath = sc.nextLine();
        
        File folder = new File(folderPath);
        
        if (folder.exists() && folder.isDirectory())
        {
            File[] files = folder.listFiles();
            
            System.out.println("Files in the folder:");
            boolean foundFile = false;
            for (File file : files) 
            {
                if (file.isFile())
                {
                    System.out.println(file.getName());
                    foundFile = true;
                }
            }
            if (!foundFile)
            {
                System.out.println("No files found in the folder.");
            }
        } 
        else 
        {
            System.out.println("Invalid folder path.");
        }
        
        sc.close();
    }
}

