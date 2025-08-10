package day8;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args)
    {
       
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to search: ");
        int input = scanner.nextInt();
        
        if (numbers.contains(input)) 
        {
            System.out.println(input + " exists in the list.");
        } 
        else 
        {
            System.out.println(input + " does not exist in the list.");
        }
        
        scanner.close();
    }
}

