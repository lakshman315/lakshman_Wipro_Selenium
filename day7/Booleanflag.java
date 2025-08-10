package day7;

class StoppableThread extends Thread {
    private volatile boolean running = true;

    public void run()
    {
        while (running) 
        {
            System.out.println("Thread is running...");
            try 
            {
                Thread.sleep(500);
            } catch (InterruptedException e) 
            {
                System.out.println("Thread interrupted");
                
            }
        }
        System.out.println("Thread has stopped.");
    }

    public void stopThread() 
    {
        running = false;
    }
}

public class Booleanflag
{
    public static void main(String[] args) throws InterruptedException 
    {
        StoppableThread t = new StoppableThread();
        t.start();

        Thread.sleep(3000); 

        System.out.println("Requesting thread to stop...");
        t.stopThread(); 

        t.join();
        System.out.println("Main thread exiting.");
    }
}
