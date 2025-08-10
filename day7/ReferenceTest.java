package day7;

class Box1 
{
    int length;

    Box1(int length)
    {
        this.length = length;
    }
}

public class ReferenceTest
{

    public static void assignNewBox(Box1 box) 
    {
        box = new Box1(50);  
        System.out.println("Inside method, box.length = " + box.length);
    }

    public static void main(String[] args) {
        Box1 myBox = new Box1(10);
        System.out.println("Before method call, myBox.length = " + myBox.length);

        assignNewBox(myBox);

        System.out.println("After method call, myBox.length = " + myBox.length);
    }
}

