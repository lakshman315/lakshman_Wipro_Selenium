package day9;

import java.util.*;

class City {
    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String toString() {
        return name + " (Population: " + population + ")";
    }
}


class PopulationComparator implements Comparator<City> {
 
    public int compare(City c1, City c2) {
        return Integer.compare(c1.getPopulation(), c2.getPopulation());
    }
}

public class SortCitiesByPopulation {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Mumbai", 12442373));
        cities.add(new City("Delhi", 11034555));
        cities.add(new City("Bengaluru", 8443675));
        cities.add(new City("Hyderabad", 6809970));

        System.out.println("Before Sorting:");
        for (City c : cities) {
            System.out.println(c);
        }

        Collections.sort(cities, new PopulationComparator());

        System.out.println("\nAfter Sorting by Population (Ascending):");
        for (City c : cities) {
            System.out.println(c);
        }
    }
}

