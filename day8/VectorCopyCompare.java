package day8;

import java.util.Vector;

public class VectorCopyCompare
{
    public static void main(String[] args) {
        Vector<String> original = new Vector<>();
        original.add("Sandhya");
        original.add("Vishala");
        original.add("Vaishu");

        Vector<String> copy = new Vector<>();
        copy.addAll(original);

        System.out.println("Original Vector: " + original);
        System.out.println("Copied Vector: " + copy);

        if (original.equals(copy))
        {
            System.out.println("Both vectors are equal.");
        } 
        else 
        {
            System.out.println("Vectors are not equal.");
        }
    }
}

