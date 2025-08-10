package day8;

import java.util.PriorityQueue;
import java.util.Comparator;

class PrintJob {
    String jobName;
    int priority; 

    public PrintJob(String jobName, int priority) 
    {
        this.jobName = jobName;
        this.priority = priority;
    }

    public String toString()
    {
        return jobName + " (Priority: " + priority + ")";
    }
}

public class PrintQueueExample {
    public static void main(String[] args) {
        
        
        PriorityQueue<PrintJob> printQueue = new PriorityQueue<>(
            Comparator.comparingInt((PrintJob job) -> job.priority).reversed()
        );

       
        printQueue.add(new PrintJob("Document_A", 3));
        printQueue.add(new PrintJob("Photo_Print", 5));
        printQueue.add(new PrintJob("Invoice", 2));
        printQueue.add(new PrintJob("Report", 4));

   
        System.out.println("Serving Print Jobs by Priority:");
        while (!printQueue.isEmpty()) 
        {
            System.out.println("Printing: " + printQueue.poll());
        }
    }
}
