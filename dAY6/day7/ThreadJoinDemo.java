package day7;

class WorkerThread extends Thread 
{
    public void run() 
    {
        System.out.println("Worker thread started.");
        try 
        {
            Thread.sleep(2000); 
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Worker thread interrupted.");
        }
        System.out.println("Worker thread finished.");
    }
}

public class ThreadJoinDemo 
{
    public static void main(String[] args) 
    {
        WorkerThread t = new WorkerThread();
        t.start();

        System.out.println("Main thread waiting for worker thread to finish...");

        try
        {
            t.join();  
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Main thread interrupted while waiting.");
        }

        System.out.println("Worker thread has finished. Main thread resumes.");
    }
}

