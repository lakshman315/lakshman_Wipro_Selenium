package day9;

import java.time.LocalDate;
import java.util.*;

class Employee1 
{
    private String name;
    private LocalDate joiningDate;

    public Employee1(String name, LocalDate joiningDate)
    {
        this.name = name;
        this.joiningDate = joiningDate;
    }

    public String getName() 
    {
        return name;
    }

    public LocalDate getJoiningDate() 
    {
        return joiningDate;
    }

    public String toString()
    {
        return name + " - " + joiningDate;
    }
}

public class SortEmployeesByJoiningDate {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("Lakshman", LocalDate.of(2021, 5, 12)));
        employees.add(new Employee1("Suvin", LocalDate.of(2019, 3, 8)));
        employees.add(new Employee1("Prudhvi", LocalDate.of(2020, 11, 23)));

        System.out.println("Before Sorting:");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparing(Employee1::getJoiningDate));

        System.out.println("\nAfter Sorting by Joining Date (Oldest first):");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparing(Employee1::getJoiningDate).reversed());

        System.out.println("\nAfter Sorting by Joining Date (Most recent first):");
        employees.forEach(System.out::println);
    }
}

