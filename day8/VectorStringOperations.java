package day8;

import java.util.Vector;

public class VectorStringOperations 
{
    public static void main(String[] args) 
    {
        Vector<String> names = new Vector<>();
        names.add("Lakshman");
        names.add("Suvin");
        names.add("Prudhvi");
        names.add("Abhiram");

        System.out.println("Original Vector: " + names);

        String searchName = "Abhiram";
        if (names.contains(searchName)) {
            System.out.println(searchName + " exists in the vector.");
        } else {
            System.out.println(searchName + " does not exist in the vector.");
        }

        int index = names.indexOf("Suvin");
        if (index != -1) {
            names.set(index, "Bharat");
            System.out.println("After replacing Suvin with Brian: " + names);
        }

        names.clear();
        System.out.println("After clearing all elements: " + names);
    }
}

