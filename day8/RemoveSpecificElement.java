package day8;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveSpecificElement 
{
    public static void main(String[] args)
    {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Original list: " + fruits);

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the fruit name to remove: ");
        String fruitToRemove = sc.nextLine();

        boolean removed = fruits.remove(fruitToRemove);

        if (removed) 
        {
            System.out.println(fruitToRemove + " was removed.");
        } 
        else 
        {
            System.out.println(fruitToRemove + " not found in the list.");
        }

        System.out.println("Updated list: " + fruits);

        sc.close();
    }
}
