package day8;

import java.util.ArrayList;
import java.util.Iterator;

public class CityIterator {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Hyderabad");
        cities.add("Vizag");
        cities.add("Vijayawada");
        cities.add("Kakinada");
        cities.add("Kurnool");

        Iterator<String> iterator = cities.iterator();

        System.out.println("List of cities:");
        while (iterator.hasNext())
        {
            String city = iterator.next();
            System.out.println(city);
        }
    }
}
