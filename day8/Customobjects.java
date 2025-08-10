package day8;

import java.util.ArrayList;

class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

 
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

   
    public void displayDetails() 
    {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class Customobjects {
    public static void main(String[] args)
    {
        
        ArrayList<Student> students = new ArrayList<>();
     
        students.add(new Student(1, "Lakshman", 82.5));
        students.add(new Student(2, "Suvin", 95.0));
        students.add(new Student(3, "Prudhvi", 73.0));
     
        for (Student student : students) 
        {
            student.displayDetails();
        }
    }
}

