package day8;

import java.util.LinkedList;
import java.util.Queue;

public class TaskManager {
    public static void main(String[] args) {
      
        Queue<String> tasks = new LinkedList<>();

        // Add tasks
        tasks.add("Complete report");
        tasks.add("Attend team meeting");
        tasks.add("Review pull request");
        tasks.add("Update project plan");

        System.out.println("Tasks in queue: " + tasks);

        System.out.println("Next task to do: " + tasks.peek());

        while (!tasks.isEmpty()) 
        {
            String completed = tasks.poll(); 
            System.out.println("Completed: " + completed);
            System.out.println("Remaining tasks: " + tasks);
        }
    }
}

