package day9;

import java.util.*;

class study 
{
    String name;
    int marks;

    study(String name, int marks) 
    {
        this.name = name;
        this.marks = marks;
    }

    String getName()
    { 
    	return name;
    }
    int getMarks()
    { 
    	return marks; 
    }

    public String toString() 
    {
        return name + " - " + marks;
    }
}

public class Student_comparator{
    public static void main(String[] args) 
    {
        List<study> students = Arrays.asList(
            new study("Lakshman", 85),
            new study("Prudhvi", 92),
            new study("Suvin", 78)
        );

        students.sort(Comparator.comparing(study::getName));
        System.out.println("By name: " + students);

        students.sort(Comparator.comparing(study::getMarks));
        System.out.println("By marks: " + students);

        students.sort(Comparator.comparing(study::getMarks).reversed());
        System.out.println("By marks (desc): " + students);
    }
}

