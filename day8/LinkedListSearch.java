package day8;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSearch {
    public static void main(String[] args) {
      
        LinkedList<String> stringList = new LinkedList<>();
     
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");
        stringList.add("fig");
        stringList.add("grape");

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a string to search: ");
        String searchString = sc.nextLine();

        if (stringList.contains(searchString)) 
        {
            System.out.println("The string \"" + searchString + "\" is found in the list.");
        } 
        else 
        {
            System.out.println("The string \"" + searchString + "\" is not found in the list.");
        }

      
        sc.close();
    }
}
