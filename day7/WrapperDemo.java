package day7;

public class WrapperDemo {
    public static void main(String[] args) {
        // 1. Check if character is a Digit
        char ch = '7';
        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is NOT a digit.");
        }

        // 2. Compare two Strings
        String s1 = "Hello";
        String s2 = "hello";

        if (s1.equals(s2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are NOT equal.");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are equal ignoring case.");
        }

        int cmp = s1.compareTo(s2);
        if (cmp == 0) {
            System.out.println("Strings are equal using compareTo.");
        } else if (cmp < 0) {
            System.out.println("s1 is lexically less than s2.");
        } else {
            System.out.println("s1 is lexically greater than s2.");
        }

        // 3. Convert using valueOf method
        Integer intObj = Integer.valueOf(123);
        Integer intObjFromStr = Integer.valueOf("456");
        Double doubleObj = Double.valueOf(12.34);
        Character charObj = Character.valueOf('A');
        Boolean boolObj = Boolean.valueOf(true);

        System.out.println("Integer from int: " + intObj);
        System.out.println("Integer from String: " + intObjFromStr);
        System.out.println("Double from double: " + doubleObj);
        System.out.println("Character from char: " + charObj);
        System.out.println("Boolean from boolean: " + boolObj);

        // 4. Create Boolean Wrapper usage
        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf("true");
        Boolean bool3 = Boolean.valueOf("False");

        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);
        System.out.println("bool3: " + bool3);

        if (bool1) {
            System.out.println("bool1 is true");
        }

        // 5. Convert null to wrapper classes
        Integer nullInt = null;
        Boolean nullBool = null;

        System.out.println("nullInt is: " + nullInt);
        System.out.println("nullBool is: " + nullBool);

        // Avoid unboxing null - causes NullPointerException
        try {
            int unboxed = nullInt;  
        } catch (NullPointerException e) {
            System.out.println("Cannot unbox null Integer");
        }

        // Safely convert String to Integer wrapper, handling null String
        String nullString = null;
        Integer safeInt = (nullString == null) ? null : Integer.valueOf(nullString);
        System.out.println("safeInt from nullString: " + safeInt);
    }
}
