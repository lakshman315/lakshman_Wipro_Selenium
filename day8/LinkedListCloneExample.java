package day8;

import java.util.LinkedList;

public class LinkedListCloneExample {
    public static void main(String[] args)
    {
        
        LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(10);
        originalList.add(20);
        originalList.add(30);
        originalList.add(40);

      @SuppressWarnings("unchecked")
		LinkedList<Integer> clonedList = (LinkedList<Integer>) originalList.clone();

        System.out.println("Original LinkedList: " + originalList);

        System.out.println("Cloned LinkedList: " + clonedList);
    }
}
