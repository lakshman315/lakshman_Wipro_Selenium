package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> 
{
    private String name;
    private int id;

    public Employee(String name, int id) 
    {
        this.name = name;
        this.id = id;
    }


    public String getName()
    {
        return name;
    }

    public int getId() {
        return id;
    }

    public int compareTo(Employee other) 
    {
        return this.name.compareTo(other.name);
    }

    
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class Comparable_employee
{
    public static void main(String[] args)
    {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Lakshman", 1));
        employees.add(new Employee("Suvin", 2));
        employees.add(new Employee("Prudhvi", 3));

        
        Collections.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

