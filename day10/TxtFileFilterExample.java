package day10;

import java.io.File;
import java.io.FilenameFilter;

public class TxtFileFilterExample
{
    public static void main(String[] args) 
    {
        
        String folderPath = "C:\\Users\\HP\\eclipse-workspace\\Assessments";  

        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory())
        {
            System.out.println("Invalid folder path.");
            return;
        }

    
        FilenameFilter txtFilter = new FilenameFilter() 
        {
          
            public boolean accept(File dir, String name) 
            {
                return name.toLowerCase().endsWith(".txt");
            }
        };

       
        String[] txtFiles = folder.list(txtFilter);

        if (txtFiles == null || txtFiles.length == 0) 
        {
            System.out.println("No .txt files found in the folder.");
        } 
        else 
        {
            System.out.println(".txt files in the folder:");
            for (String fileName : txtFiles) 
            {
                System.out.println(fileName);
            }
        }
    }
}
