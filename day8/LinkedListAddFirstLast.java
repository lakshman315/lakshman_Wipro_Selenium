package day8;

import java.util.LinkedList;

public class LinkedListAddFirstLast {
    public static void main(String[] args)
    {
        
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original list: " + numbers);

        numbers.addFirst(5);

        numbers.addLast(40);

        System.out.println("Updated list after adding first and last elements: " + numbers);
    }
}
