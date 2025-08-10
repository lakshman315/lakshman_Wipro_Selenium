package day7;

class SharedResource 
{
    private int number;
    private boolean available = false;

    public synchronized void produce(int num) throws InterruptedException 
    {
        while (available) 
        {   
            wait();
        }
        this.number = num;
        System.out.println("Produced: " + num);
        available = true;
        notifyAll();  
    }

    public synchronized void consume() throws InterruptedException 
    {
        while (!available) 
        {  
            wait();
        }
        System.out.println("Consumed: " + number);
        available = false;
        notifyAll();  
    }
}

class Producer implements Runnable 
{
    private SharedResource resource;

    public Producer(SharedResource resource) 
    {
        this.resource = resource;
    }

    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            try 
            {
                resource.produce(i);
                Thread.sleep(500);  
            } 
            catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable 
{
    private SharedResource resource;

    public Consumer(SharedResource resource) 
    {
        this.resource = resource;
    }

    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            try 
            {
                resource.consume();
                Thread.sleep(500);  
            }
            catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class WaitNotifyDemo 
{
    public static void main(String[] args)
    {
        SharedResource resource = new SharedResource();
        Thread producer = new Thread(new Producer(resource));
        Thread consumer = new Thread(new Consumer(resource));

        producer.start();
        consumer.start();
    }
}

