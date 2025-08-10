package day8;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args)
    {
        
        LinkedList<String> names = new LinkedList<>();

        names.add("Lakshman");
        names.add("Suvin");
        names.add("Prudhvi");
        names.add("David");

        System.out.println("Before insertion: " + names);

        names.add(2, "Kiran");

        System.out.println("After insertion: " + names);
    }
}
