package day7;

class YieldDemo extends Thread {
    public YieldDemo(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(getName() + " - Count: " + i);

            
            if (i == 3) 
            {
                System.out.println(getName() + " is yielding...");
                Thread.yield();
            }
        }
        System.out.println(getName() + " finished.");
    }
}

public class ThreadYieldExample {
    public static void main(String[] args) {
        YieldDemo t1 = new YieldDemo("Thread-1");
        YieldDemo t2 = new YieldDemo("Thread-2");

        t1.start();
        t2.start();
    }
}
