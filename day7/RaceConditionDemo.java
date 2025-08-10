package day7;

public class RaceConditionDemo {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException
    {
        Thread t1 = new Thread(() -> incrementCounter());
        Thread t2 = new Thread(() -> incrementCounter());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final counter value: " + counter);
    }

    private static void incrementCounter() 
    {
        for (int i = 0; i < 100000; i++) 
        {
           
            counter++;
        }
    }
}
