package dAY6;

public class ImplicitNarrowingExample
{
    public static void main(String[] args) {
        
        int a = 100; 
        long b = a; 
        System.out.println("Long value (implicit widening): " + b);
 
        long c= 100000L; 
        int d = (int) c; 
        System.out.println("Narrowed value (explicit narrowing): " + d);

        long e = 3000000000L; 
        int f = (int) e; 
        System.out.println("Another narrowed value (potential data loss): " + f);
    }
}

