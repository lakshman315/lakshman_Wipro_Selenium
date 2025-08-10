package day7;

public class PrimitiveDemo {
    static void change(int x) {
        x = 99;
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before: " + a);
        change(a);
        System.out.println("After: " + a);
    }
}

