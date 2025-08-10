package day8;

import java.util.LinkedList;
import java.util.Queue;

public class BankQueueSimulation {
    public static void main(String[] args)
    {
       
        Queue<String> bankQueue = new LinkedList<>();
     
        bankQueue.add("Lakshman");
        bankQueue.add("Suvin");
        bankQueue.add("Prudhvi");
        bankQueue.add("David");
        bankQueue.add("Lohith");

        System.out.println("Initial Queue: " + bankQueue);

        while (!bankQueue.isEmpty())
        {
            String servedCustomer = bankQueue.poll(); 
            System.out.println("Serving customer: " + servedCustomer);
            System.out.println("Queue after serving: " + bankQueue);
        }
    }
}
