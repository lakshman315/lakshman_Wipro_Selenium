package day8;

import java.util.*;

public class ReverseOrderTreeSet {
    public static void main(String[] args) {
        
        TreeSet<String> countries = new TreeSet<>(new Comparator<String>() {
        
            public int compare(String s1, String s2)
            {
                return s2.compareTo(s1); 
            }
        });

        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("Germany");
        countries.add("Brazil");

     
        System.out.println("Countries in reverse alphabetical order:");
        for (String country : countries)
        {
            System.out.println(country);
        }
    }
}
