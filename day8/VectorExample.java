package day8;

import java.util.Vector;
import java.util.Enumeration;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.insertElementAt(33, 2);

        numbers.remove(1);

       
        Enumeration<Integer> enumeration = numbers.elements();
        System.out.println("Elements in Vector:");
        while (enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }
    }
}

