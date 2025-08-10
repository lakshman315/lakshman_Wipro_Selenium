package day10;

import java.nio.file.*;

public class FileOperations {
    public static void main(String[] args) {
        try 
        {
            
            Path sourcePath = Paths.get("example.txt");
            if (!Files.exists(sourcePath)) {
                Files.createFile(sourcePath);
                System.out.println("File created: " + sourcePath.toAbsolutePath());
            } 
            else
            {
                System.out.println("File already exists: " + sourcePath.toAbsolutePath());
            }

           
            Path targetPath = Paths.get("newFolder/example_moved.txt");

      
            if (!Files.exists(targetPath.getParent())) 
            {
                Files.createDirectories(targetPath.getParent());
            }

            Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved to: " + targetPath.toAbsolutePath());

            // 3. Delete the file
            Files.delete(targetPath);
            System.out.println("File deleted: " + targetPath.toAbsolutePath());

        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
