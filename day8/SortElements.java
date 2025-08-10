package day8;

import java.util.ArrayList;
import java.util.Collections;

public class SortElements {
    public static void main(String[] args) 
    {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(42);
        numbers.add(7);
        numbers.add(19);
        numbers.add(3);
        numbers.add(27);
        numbers.add(15);
        numbers.add(10);

        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);
    }
}
