package day8;

import java.util.Collections;
import java.util.LinkedList;

public class SortLinkedList 
{
    public static void main(String[] args) 
    {
       
        LinkedList<Integer> numbers = new LinkedList<>();
 
        numbers.add(8);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);

        System.out.println("Unsorted LinkedList: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted LinkedList: " + numbers);
    }
}
