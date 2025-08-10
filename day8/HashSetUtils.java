package day8;

import java.util.HashSet;
import java.util.NoSuchElementException;

public class HashSetUtils {
    public static Integer getMaxElement(HashSet<Integer> set) 
    {
        if (set == null || set.isEmpty()) {
            throw new NoSuchElementException("HashSet is null or empty");
        }
        
        Integer max = Integer.MIN_VALUE;
        for (Integer num : set) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(12);
        numbers.add(3);
        numbers.add(99);
        numbers.add(42);
        
        System.out.println("Max element: " + getMaxElement(numbers));  
    }
}
