package day7;

class Box 
{
    int length;

    Box(int length) 
    {
        this.length = length;
    }
}

public class BoxDemo {

    static void modifyLength(Box b) {
        b.length = 100;  
    }

    public static void main(String[] args)
    {
        Box myBox = new Box(50);
        System.out.println("Original length: " + myBox.length);

        modifyLength(myBox); 

        System.out.println("Modified length: " + myBox.length);
    }
}
