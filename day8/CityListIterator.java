package day8;

import java.util.LinkedList;
import java.util.ListIterator;

public class CityListIterator {
    public static void main(String[] args) 
    {
         LinkedList<String> cities = new LinkedList<>();
        cities.add("Rajamundry");
        cities.add("Kakinada");
        cities.add("Ravulapalem");
        cities.add("Vizag");
        cities.add("Vijayawada");

        ListIterator<String> iterator = cities.listIterator();

        System.out.println("Cities in forward direction:");
       
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("\nCities in reverse direction:");
        
        while (iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }
    }
}
