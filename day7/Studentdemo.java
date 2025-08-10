package day7;

class Student {
    String name;
    int marks;

    Student(String name, int marks) 
    {
        this.name = name;
        this.marks = marks;
    }

    void updateMarks(int newMarks) 
    {
        this.marks = newMarks;
    }

    void display()
    {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class Studentdemo {
    public static void main(String[] args) 
    {
        Student s1 = new Student("Lakshman", 85);

        System.out.print("Before update: ");
        s1.display();

        s1.updateMarks(95);

        System.out.print("After update: ");
        s1.display();
    }
}

