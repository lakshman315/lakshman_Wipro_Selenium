package day7;

class MyRunnable implements Runnable 
{
  
    public void run() 
    {
        System.out.println("Current thread name: " + Thread.currentThread().getName());
    }
}

public class ThreadDemo1
{
    public static void main(String[] args) 
    {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
