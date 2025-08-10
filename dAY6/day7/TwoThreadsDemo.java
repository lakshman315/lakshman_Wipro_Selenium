package day7;

class MessagePrinter implements Runnable 
{
    private String message;

    public MessagePrinter(String message) 
    {
        this.message = message;
    }

   
    public void run() {
        for(int i = 0; i < 5; i++) 
        {
            System.out.println(message);
            try {
                Thread.sleep(500); 
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}

public class TwoThreadsDemo
{
    public static void main(String[] args) 
    {
        Thread thread1 = new Thread(new MessagePrinter("Hello from Thread 1"));
        Thread thread2 = new Thread(new MessagePrinter("Hello from Thread 2"));

        thread1.start();
        thread2.start();
    }
}

