package day7;

public class ChangeIntDemo {

    public static void changeValue(int num) {
        System.out.println("Inside method before change: " + num);
        num = 100;  
        System.out.println("Inside method after change: " + num);
    }

    public static void main(String[] args) {
        int original = 50;
        System.out.println("Before method call: " + original);
        changeValue(original);
        System.out.println("After method call: " + original);
    }
}
