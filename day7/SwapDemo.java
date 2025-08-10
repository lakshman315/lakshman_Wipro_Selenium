package day7;

public class SwapDemo {

    public static void swap(int a, int b) {
        System.out.println("Inside swap method before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap method after swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        
        System.out.println("Before calling swap: x = " + x + ", y = " + y);
        
        swap(x, y);  
        
        System.out.println("After calling swap: x = " + x + ", y = " + y);
    }
}

