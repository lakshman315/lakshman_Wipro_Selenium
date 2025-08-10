package day8;

import java.util.HashSet;

public class CityHashSetOperations 
{
    public static void main(String[] args) 
    {
     
        HashSet<String> cities = new HashSet<>();
        
        cities.add("Rajamundry");
        cities.add("Kakinada");
        cities.add("Vijayawada");
        cities.add("Vizag");
        cities.add("Hyderabad");
        
        System.out.println("Initial HashSet: " + cities);
        
        boolean removed = cities.remove("Vizag");
        System.out.println("Removed Vizag? " + removed);
        System.out.println("After removal: " + cities);
        
        String cityToCheck = "Kakinada";
        boolean exists = cities.contains(cityToCheck);
        System.out.println(cityToCheck + " exists? " + exists);
        
        cities.clear();
        System.out.println("HashSet after clear: " + cities);
    }
}

