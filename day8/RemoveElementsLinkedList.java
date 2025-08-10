package day8;

import java.util.LinkedList;

public class RemoveElementsLinkedList {
    public static void main(String[] args) {
        
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Lion");

        System.out.println("Original List: " + animals);

        animals.removeFirst();
        System.out.println("After removing first element: " + animals);

        animals.removeLast();
        System.out.println("After removing last element: " + animals);

        String animalToRemove = "Elephant";
        animals.remove(animalToRemove);
        System.out.println("After removing '" + animalToRemove + "': " + animals);
    }
}
