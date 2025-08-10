package day9;

import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
   
    public int compareTo(Student other)
    {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    public String toString() 
    {
        return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}

public class Comparable_demo1 
{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(102, "Lakshman", 85.5));
        students.add(new Student(101, "Suvin", 94.0));
        students.add(new Student(104, "Prudvi", 75.3));
        students.add(new Student(103, "David", 83.0));

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students);

        System.out.println("\nAfter Sorting by Roll No (Ascending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

