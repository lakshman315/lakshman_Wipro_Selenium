package day8;

import java.util.HashSet;
import java.util.Iterator;

public class CityHashSetDemo {
    public static void main(String[] args) {
    
        HashSet<String> cities = new HashSet<>();
   
        cities.add("Rajamundry");
        cities.add("Vizag");
        cities.add("Kakinada");
        cities.add("Annavaram");
        cities.add("Tirupati");

        boolean added = cities.add("Vizag"); 

        if (!added) {
            System.out.println("Duplicate city 'Vizag' was not added.");
        }

        
        Iterator<String> iterator = cities.iterator();
        System.out.println("Cities in the HashSet:");
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
    }
}
