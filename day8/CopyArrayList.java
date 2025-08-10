package day8;

import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");

        ArrayList<String> list2 = new ArrayList<>();

        list2.addAll(list1);

        System.out.println("First ArrayList: " + list1);
        System.out.println("Second ArrayList (after copy): " + list2);
    }
}

