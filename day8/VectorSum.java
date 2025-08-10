package day8;

import java.util.Vector;

public class VectorSum {
   
    public static int sumVectorElements(Vector<Integer> vec) 
    {
        int sum = 0;
        for (int num : vec)
        {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int sum = sumVectorElements(numbers);
        System.out.println("Sum of elements in vector: " + sum);
    }
}
