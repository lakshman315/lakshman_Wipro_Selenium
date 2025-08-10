package day7;

public class SleepDemo {
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 3; i++) 
        {
            System.out.println(i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e)
            {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}

