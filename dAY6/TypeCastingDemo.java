package dAY6;

import java.util.Scanner;

public class TypeCastingDemo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int intValue = sc.nextInt();
        double doubleValue = intValue;
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value (after implicit widening): " + doubleValue);
        System.out.print("Enter a double value: ");
        double inputDouble = sc.nextDouble();
        int castedInt = (int) inputDouble;
        short castedShort = (short) castedInt;
        System.out.println("Double value entered: " + inputDouble);
        System.out.println("After casting to int (truncation): " + castedInt);
        System.out.println("After casting int to short (possible overflow): " + castedShort);
        sc.close();
    }
}
