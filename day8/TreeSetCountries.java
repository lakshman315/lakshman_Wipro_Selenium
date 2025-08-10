package day8;

import java.util.TreeSet;

public class TreeSetCountries {
    public static void main(String[] args) {
       
        TreeSet<String> countries = new TreeSet<>();
        
        countries.add("India");
        countries.add("Australia");
        countries.add("Canada");
        countries.add("Brazil");
        countries.add("Denmark");

  
        System.out.println("Sorted list of countries: " + countries);
    }
}

