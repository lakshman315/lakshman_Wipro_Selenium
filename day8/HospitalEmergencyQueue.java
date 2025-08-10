package day8;

import java.util.PriorityQueue;
import java.util.Comparator;

class Patient {
    String name;
    int severityLevel;

    public Patient(String name, int severityLevel) 
    {
        this.name = name;
        this.severityLevel = severityLevel;
    }

    public String toString() 
    {
        return name + " (Severity: " + severityLevel + ")";
    }
}

public class HospitalEmergencyQueue 
{
    public static void main(String[] args) 
    {
       
        PriorityQueue<Patient> emergencyQueue = new PriorityQueue<>(
            Comparator.comparingInt((Patient p) -> p.severityLevel).reversed()
        );

        emergencyQueue.add(new Patient("John", 5));
        emergencyQueue.add(new Patient("Alice", 8));
        emergencyQueue.add(new Patient("Bob", 3));
        emergencyQueue.add(new Patient("Mary", 10));

        System.out.println("Serving patients in order of severity:");
        while (!emergencyQueue.isEmpty()) 
        {
            System.out.println("Treating: " + emergencyQueue.poll());
        }
    }
}
