package day7;

class MyThread1 extends Thread {
    public MyThread1(String name) {
        super(name);
    }

    public void run()
    {
        System.out.println(getName() + " started with priority " + getPriority());
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(getName() + " is running: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " finished.");
    }
}

public class ThreadPriorityDemo 
{
    public static void main(String[] args)
    {
        MyThread1 t1 = new MyThread1("Thread-1");
        MyThread1 t2 = new MyThread1("Thread-2");
        MyThread1 t3 = new MyThread1("Thread-3");

        t1.setPriority(Thread.MIN_PRIORITY);    
        t2.setPriority(Thread.NORM_PRIORITY);   
        t3.setPriority(Thread.MAX_PRIORITY);   

       
        t1.start();
        t2.start();
        t3.start();
    }
}

